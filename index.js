const { onSchedule } = require("firebase-functions/v2/scheduler");
const logger = require("firebase-functions/logger");
const admin = require("firebase-admin");
const { run } = require("./logic");

admin.initializeApp();

exports.avisosCobros = onSchedule(
  {
    schedule: "0 7-12 * * *",
    timeZone: "America/Santo_Domingo",
    region: "us-central1",
    timeoutSeconds: 300,
    memory: "256MiB",
    retryCount: 0
  },
  async event => {
    const when = event.scheduleTime ? new Date(event.scheduleTime) : new Date();
    const st = await run(admin.firestore(), admin.messaging(), when, m => logger.error(m));
    logger.info("avisosCobros", st);
  }
);
