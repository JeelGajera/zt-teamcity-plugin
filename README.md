# Zero Threat AI Powered Security Scanner – TeamCity Plugin

Secure your code proactively. Use the ZeroThreat AI Powered Web Application/API Security Scanner to perform Dynamic
Application Security Testing (DAST). It enables comprehensive Dynamic Application Security Testing (DAST) to detect
vulnerabilities, making findings readily available on the ZeroThreat Portal for review.

## Configuration Parameters

| Parameter               | Description                                                          | Required | Default |
|-------------------------|----------------------------------------------------------------------|----------|---------|
| `ZT_TOKEN`              | ZT_TOKEN to authenticate API request & start the scan.               | Yes      |         |
| `WAIT_FOR_ANALYSIS`     | Set this true to wait for analysis to complete before finishing job. | No       | false   |
| `ON_PREM_PROXY_API_URL` | Set proxy url host to scan internal targets.                         | No       |         |

---

## How It Works

1. **ZeroThreat AI Scanner**: The DAST scan is triggered by passing the zt_token. Each token corresponds to a specific
   target defined within the ZeroThreat application. Upon receiving the token, the ZeroThreat DevOps Bot executes
   prerequisite checks before commencing the scan process.
2. **Scan Report**: As soon as the ZeroThreat DevOps Bot starts the security scan, The scan report will be available in the ZeroThreat Portal.

---

## Setup Instructions

### 1. Generate Your Token

Create a new `zt_token` from the ZeroThreat Portal under your project target configuration.

### 2. Add Parameters in TeamCity

In your Build Configuration:

1. Navigate to **Build Parameters → Configuration Parameters**.
2. Add the following parameters:

    * `ZT_TOKEN` → your token
    * `WAIT_FOR_ANALYSIS` → `true` or `false`
    * `ON_PREM_PROXY_API_URL` → (optional) proxy URL for internal scanning

### 3. Add the Build Step

Add a new **ZeroThreat AI Scan** build step in TeamCity and map the parameters you configured.

---

## Notes

* Ensure that the `ZT_TOKEN` parameter is stored securely in TeamCity.
* If scanning internal environments, make sure the proxy endpoint is reachable from the TeamCity agent.
* All scan results, including vulnerabilities and risk scores, remain accessible through the ZeroThreat Portal.

