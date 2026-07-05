package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import com.anthropic.claude.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ryi {
    public static final u5f a(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            u5f u5fVar = tag instanceof u5f ? (u5f) tag : null;
            if (u5fVar != null) {
                return u5fVar;
            }
            Object objA = bmk.a(view);
            view = objA instanceof View ? (View) objA : null;
        }
        return null;
    }

    public static kjc b(Context context) {
        File file;
        kjc ycdVar = x.E;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            try {
                file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            } catch (RuntimeException e) {
                Log.e("HermeticFileOverrides", "no data dir", e);
            }
            kjc ycdVar2 = file.exists() ? new ycd(file) : ycdVar;
            if (ycdVar2.b()) {
                ycdVar = new ycd(c(context, (File) ycdVar2.a()));
            }
            return ycdVar;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static ook c(Context context, File file) {
        BufferedReader bufferedReader;
        w6g w6gVar;
        HashMap map;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                w6gVar = new w6g(0);
                map = new HashMap();
            } finally {
            }
        } catch (IOException e) {
            xh6.h(e);
            return null;
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                ook ookVar = new ook(w6gVar);
                bufferedReader.close();
                return ookVar;
            }
            String[] strArrSplit = line.split(" ", 3);
            if (strArrSplit.length != 3) {
                Log.e("HermeticFileOverrides", "Invalid: " + line);
            } else {
                String str = new String(strArrSplit[0]);
                String strDecode = Uri.decode(new String(strArrSplit[1]));
                String strDecode2 = (String) map.get(strArrSplit[2]);
                if (strDecode2 == null) {
                    String str2 = new String(strArrSplit[2]);
                    strDecode2 = Uri.decode(str2);
                    if (strDecode2.length() < 1024 || strDecode2 == str2) {
                        map.put(str2, strDecode2);
                    }
                }
                w6g w6gVar2 = (w6g) w6gVar.get(str);
                if (w6gVar2 == null) {
                    w6gVar2 = new w6g(0);
                    w6gVar.put(str, w6gVar2);
                }
                w6gVar2.put(strDecode, strDecode2);
            }
            xh6.h(e);
            return null;
        }
    }
}
