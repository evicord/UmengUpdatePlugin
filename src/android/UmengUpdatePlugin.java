package com.tyrion.plugin.umengupdate;

import com.umeng.update.UmengUpdateAgent;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class UmengUpdatePlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("init")) {
            UmengUpdateAgent.update(this.cordova.getActivity());
            return true;
        }
        return false;
    }
}
