package com.zerothreatai.teamcity.CONST;

public interface BuildParams {
    String ZT_TOKEN = "ZT_TOKEN";
    String WAIT_FOR_ANALYSIS = "WAIT_FOR_ANALYSIS";
    String ZT_TOKEN_MESSAGE = "ZT_TOKEN is require for initialization scan.";
    String WAIT_FOR_ANALYSIS_MESSAGE = "Only 'true' and 'false' inputs are valid.";
    String ON_PREM_PROXY_API_URL = "ON_PREM_PROXY_API_URL";
    String ON_PREM_PROXY_API_URL_MESSAGE = "Enter valid proxy url host to scan internal targets.";
}
