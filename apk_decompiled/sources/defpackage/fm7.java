package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fm7 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public fm7(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = zrg.a;
        dgj.x("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static fm7 a(Context context) {
        cbf cbfVar = new cbf(context);
        String strJ = cbfVar.j("google_app_id");
        if (TextUtils.isEmpty(strJ)) {
            return null;
        }
        return new fm7(strJ, cbfVar.j("google_api_key"), cbfVar.j("firebase_database_url"), cbfVar.j("ga_trackingId"), cbfVar.j("gcm_defaultSenderId"), cbfVar.j("google_storage_bucket"), cbfVar.j("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fm7)) {
            return false;
        }
        fm7 fm7Var = (fm7) obj;
        return gb9.v(this.b, fm7Var.b) && gb9.v(this.a, fm7Var.a) && gb9.v(this.c, fm7Var.c) && gb9.v(this.d, fm7Var.d) && gb9.v(this.e, fm7Var.e) && gb9.v(this.f, fm7Var.f) && gb9.v(this.g, fm7Var.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        q28 q28Var = new q28(this);
        q28Var.c("applicationId", this.b);
        q28Var.c("apiKey", this.a);
        q28Var.c("databaseUrl", this.c);
        q28Var.c("gcmSenderId", this.e);
        q28Var.c("storageBucket", this.f);
        q28Var.c("projectId", this.g);
        return q28Var.toString();
    }
}
