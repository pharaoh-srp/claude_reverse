package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes.dex */
public final class f8 {
    public final SharedPreferences a;
    public final lsc b;
    public final lsc c;
    public final lsc d;
    public final mdg e;
    public final mdg f;

    public f8(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
        String string = sharedPreferences.getString("selected_org_id", null);
        String strM1066constructorimpl = string != null ? OrganizationId.m1066constructorimpl(string) : null;
        this.b = mpk.P(strM1066constructorimpl != null ? OrganizationId.m1065boximpl(strM1066constructorimpl) : null);
        this.c = mpk.P(sharedPreferences.getString("display_email", null));
        this.d = mpk.P(sharedPreferences.getString("conway_saved_client_id", null));
        this.e = new mdg();
        this.f = new mdg();
    }
}
