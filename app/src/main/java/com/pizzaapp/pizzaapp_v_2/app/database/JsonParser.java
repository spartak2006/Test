package com.pizzaapp.pizzaapp_v_2.app.database;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * Created by neso on 17.04.14..
 */
public class JsonParser

{
    private static InputStream inputStream = null;
    private static JSONObject  jsonObject  = null;
    private static String      json        = "";


    public JsonParser()
    {

    }

    public JSONObject makeHttpRequest(String url, String method, List<NameValuePair> params)
    {


        try
        {
            if (method == "Get")
            {
                DefaultHttpClient httpClient = new DefaultHttpClient();
                String paramString = URLEncodedUtils.format(params, "utf-8");
                url += "?" + paramString;
                HttpGet httpGet = new HttpGet();

                HttpResponse httpResponse = httpClient.execute(httpGet);
                HttpEntity httpEntity = httpResponse.getEntity();
                inputStream = httpEntity.getContent();

            }
        } catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();

        } catch (ClientProtocolException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        }

        try
        {

            jsonObject = new JSONObject(json);

        } catch (JSONException e)
        {
            e.printStackTrace();
        }

        return jsonObject;
    }

}
