package com.zngl.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.github.pagehelper.PageInfo;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;


public class RestData implements View
{
	JSONObject json = new JSONObject();
	public Object data = null;

	String reason = null;

	int code = 0;

	Long count = null;

	Integer total = null;

	public RestData(String reason)
	{
		this.reason = reason;
	}

	public RestData(int code)
	{
		this.code = code;
	}

	public RestData(int code, String reason)
	{
		this.code = code;
		this.reason = reason;
	}
	
	public RestData(Object data)
	{
		this.data = data;
	}

	public RestData(Object data, Long count)
	{
		this.data = data;
		this.count = count;
	}

	public RestData(Object data, String reason)
	{
		this.data = data;
		this.reason = reason;
	}

	public RestData(Object data, int code)
	{
		this.data = data;
		this.code = code;
	}

	public RestData(Object data, int code, String reason)
	{
		this.data = data;
		this.code = code;
		this.reason = reason;
	}

	public RestData(PageInfo info)
	{
		this.data = info.getList();
		this.count = info.getTotal();
	}

	public RestData(PageInfo info, Integer total)
	{
		this.data = info.getList();
		this.count = info.getTotal();
		this.total = total == null ? 0 : total;
	}
		
	@Override
	public void render(Map<String, ?> model
			, HttpServletRequest request
			, HttpServletResponse response) throws Exception
	{
		json.put("success", true);
		json.put("code", this.code);

		if (this.reason != null) {
			json.put("msg", this.reason);
		}
		if (count != null) {
			json.put("count", this.count);
		}
		if (total != null) {
			json.put("total", this.total);
		}

		if(data != null)
		{
			if(data instanceof JSON) // 本身就是 JSONObject 或 JSONArray
				json.put("data", data);
			else
				json.put("data", JSON.toJSON(data));
		}

		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		response.getWriter().print( JSON.toJSONString(json, SerializerFeature.PrettyFormat));
	}

	//设置key.value
	public void setValue (String key, Object velue) {
		try {
			if (key.isEmpty() && velue == null) {
				return;
			}
			this.json.put(key, velue);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
}
