package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.google.gson.JsonIOException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class wg implements sac, sl6, w9c, v0i {
    public static final wg G;
    public static final wg H;
    public static final wg I;
    public static final wg J;
    public static final wg K;
    public static final wg L;
    public static final wg M;
    public static final wg N;
    public static final wg O;
    public static final wg P;
    public static final wg Q;
    public static final wg R;
    public static final wg S;
    public static final wg T;
    public static final wg U;
    public static final wg V;
    public static final wg W;
    public static final wg X;
    public static final wg Y;
    public static final wg Z;
    public final /* synthetic */ int E;
    public String F;

    static {
        int i = 0;
        boolean z = false;
        G = new wg("TINK", i, z);
        H = new wg("CRUNCHY", i, z);
        I = new wg("NO_PREFIX", i, z);
        int i2 = 1;
        J = new wg("TINK", i2, z);
        K = new wg("CRUNCHY", i2, z);
        L = new wg("NO_PREFIX", i2, z);
        int i3 = 2;
        M = new wg("TINK", i3, z);
        N = new wg("CRUNCHY", i3, z);
        O = new wg("NO_PREFIX", i3, z);
        int i4 = 3;
        P = new wg("VERTICAL", i4, z);
        Q = new wg("HORIZONTAL", i4, z);
        int i5 = 4;
        R = new wg("FOLD", i5, z);
        S = new wg("HINGE", i5, z);
        int i6 = 5;
        T = new wg("TINK", i6, z);
        U = new wg("CRUNCHY", i6, z);
        V = new wg("LEGACY", i6, z);
        W = new wg("NO_PREFIX", i6, z);
        int i7 = 6;
        X = new wg("TINK", i7, z);
        Y = new wg("CRUNCHY", i7, z);
        Z = new wg("NO_PREFIX", i7, z);
    }

    public wg(String str, int i) {
        this.E = i;
        switch (i) {
            case 12:
                str.getClass();
                this.F = str;
                break;
            case 13:
                str.getClass();
                this.F = str;
                break;
            default:
                this.F = new JSONObject(str).optString("countryCode");
                break;
        }
    }

    public static wg d(ssc sscVar) {
        String str;
        sscVar.N(2);
        int iZ = sscVar.z();
        int i = iZ >> 1;
        int iZ2 = ((sscVar.z() >> 3) & 31) | ((iZ & 1) << 5);
        int i2 = 10;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbO = ij0.o(str);
        sbO.append(i < 10 ? ".0" : ".");
        sbO.append(i);
        return new wg(ij0.g(iZ2, iZ2 < 10 ? ".0" : ".", sbO), i2, false);
    }

    public static CharSequence g(Object obj) {
        Objects.requireNonNull(obj);
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    @Override // defpackage.v0i
    public String H(Context context, boolean z, boolean z2) {
        switch (this.E) {
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                context.getClass();
                String str = this.F;
                if (str != null) {
                    return str;
                }
                String string = context.getString(z2 ? R.string.recipe_display_tool_status_failed : z ? R.string.recipe_display_tool_status_success : R.string.recipe_display_tool_status_loading);
                string.getClass();
                return string;
            default:
                String str2 = this.F;
                context.getClass();
                if (z2) {
                    String string2 = context.getString(R.string.search_mcp_registry_status_failed);
                    string2.getClass();
                    return string2;
                }
                if (str2 == null || str2.length() == 0) {
                    String string3 = context.getString(z ? R.string.search_mcp_registry_status_complete : R.string.search_mcp_registry_status_loading);
                    string3.getClass();
                    return string3;
                }
                if (z) {
                    String string4 = context.getString(R.string.search_mcp_registry_status_complete_query, str2);
                    string4.getClass();
                    return string4;
                }
                String string5 = context.getString(R.string.search_mcp_registry_status_loading_query, str2);
                string5.getClass();
                return string5;
        }
    }

    @Override // defpackage.w9c
    public String Z() {
        return vb7.s(new StringBuilder("expected '"), this.F, '\'');
    }

    public void a(StringBuilder sb, Iterator it) {
        try {
            if (it.hasNext()) {
                sb.append(g(it.next()));
                while (it.hasNext()) {
                    sb.append((CharSequence) this.F);
                    sb.append(g(it.next()));
                }
            }
        } catch (IOException e) {
            sz6.h(e);
        }
    }

    public zf b() {
        if (this.F != null) {
            return new zf(this);
        }
        sz6.p("Product type must be set");
        return null;
    }

    public String c() {
        return this.F;
    }

    @Override // defpackage.sl6
    public boolean e(CharSequence charSequence, int i, int i2, pbi pbiVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.F)) {
            return true;
        }
        pbiVar.c = (pbiVar.c & 3) | 4;
        return false;
    }

    public void f() {
        this.F = "subs";
    }

    @Override // defpackage.sl6
    public Object getResult() {
        return this;
    }

    @Override // defpackage.sac
    public Object o0() {
        throw new JsonIOException(this.F);
    }

    public String toString() {
        switch (this.E) {
            case 0:
                return this.F;
            case 1:
                return this.F;
            case 2:
                return this.F;
            case 3:
                return this.F;
            case 4:
                return this.F;
            case 5:
                return this.F;
            case 6:
                return this.F;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wg(String str, int i, boolean z) {
        this.E = i;
        this.F = str;
    }

    public /* synthetic */ wg(int i) {
        this.E = i;
    }
}
