package com.jobportal.utility;

public class Data {

    public static String getMessageBody(String otp, String name) {

        return "<!DOCTYPE html>"
                + "<html>"
                + "<head><style>"
                + "body {font-family: Arial, sans-serif; background-color: #f8f9fa; margin: 0; padding: 0;}"
                + ".container {max-width: 600px; margin: 0 auto; background-color: #ffffff; border-radius: 5px;}"
                + ".header {background-color: #4caf50; color: #ffffff; text-align: center; padding: 20px; font-size: 24px;}"
                + ".content {padding: 20px; text-align: center; color: #333333; font-size: 16px;}"
                + ".otp {font-size: 32px; font-weight: bold; color: #4caf50; margin: 20px 0;}"
                + ".footer {background-color: #f0f0f0; text-align: center; padding: 10px; font-size: 12px; color: #777777;}"
                + "a {color: #4caf50; text-decoration: none;}"
                + "</style></head>"
                + "<body>"
                + "<div class='container'>"
                + "<div class='header'>Your OTP Code Requested from JOBHOOK</div>"
                + "<div class='content'>"
                + "<p>Hello! " + name + ",</p>"
                + "<p>Your OTP code is:</p>"
                + "<div class='otp'>" + otp + "</div>"
                + "<p>This code is valid for the next <strong>10 minutes</strong>. Please do not share it with anyone.</p>"
                + "<p>If you did not request this code, please ignore this email.</p>"
                + "</div>"
                + "<div class='footer'>&copy; 2024 JobHook. All Rights Reserved.<br>"
                + "Contact us at <a href='mailto:support@yourcompany.com'>support@yourcompany.com</a></div>"
                + "</div>"
                + "</body></html>";

    }

}
