package com.zngl.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

public class RestError implements View
{	
	public int code = -1;
	public String reason = "";
	
	public RestError()
	{		
	}

	public RestError(int code)
	{
		this.code = code;
	}

	public RestError(String reason)
	{
		this.reason = reason;
	}

	public RestError(int code, String reason)
	{
		this.code = code;
		this.reason = reason;
	}

	public RestError(Exception e)
	{
		reason = e.getMessage();
		if(reason == null)
			reason = e.getClass().getName();
	}
	
	@Override
	public void render(Map<String, ?> model
			, HttpServletRequest request
			, HttpServletResponse response) throws Exception
	{
		JSONObject json = new JSONObject(true);
		json.put("code", code);
		json.put("success", false);
		json.put("msg", reason);
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		response.getWriter().print( JSON.toJSONString(json,SerializerFeature.PrettyFormat) );
	}

}
