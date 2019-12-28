package com.restaurant.thariq.utils;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;

public class DialogUtils {
    public static ProgressDialog progressDialog;
    public static void openDialog(Context context) {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading . . . ");
        progressDialog.show(); }
    public static void closeDialog() {
        progressDialog.dismiss(); } }
