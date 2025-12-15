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
app.post("/api/v1/workouts", (req, res) => {
  console.log("Received workout request:", req.body);

  res.json({
    message: "Gateway received workout request",
    receivedAt: new Date().toISOString()
  });
});

// Start server
app.listen(PORT, () => {
  console.log(`🚪 API Gateway running on http://localhost:${PORT}`);
});
