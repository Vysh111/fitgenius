const express = require("express");
const cors = require("cors");

const app = express();
const PORT = 4000;

// Middlewares
app.use(cors());
app.use(express.json());

// Health check
app.get("/api/v1/health", (req, res) => {
  res.json({
    status: "OK",
    service: "API Gateway",
    timestamp: new Date().toISOString()
  });
});

// TEMP: Workout creation endpoint (will forward later)
const axios = require("axios");

app.post("/api/v1/workouts", async (req, res) => {
  try {
    console.log("Gateway: forwarding request to Spring Boot");

    const response = await axios.post(
      "http://localhost:8080/api/v1/workouts",
      req.body
    );

    res.json(response.data);

  }
   catch (error) {
     console.error("Gateway error:", error.message);

     // If Spring Boot responded with an error (like 400)
     if (error.response) {
       return res
         .status(error.response.status)
         .json(error.response.data);
     }

     // If Spring Boot is unreachable
     res.status(502).json({
       error: "Bad Gateway",
       message: "Analytics service unavailable"
     });
   }

});

// Start server
app.listen(PORT, () => {
  console.log(`🚪 API Gateway running on http://localhost:${PORT}`);
});

