package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.anthropic.claude.api.tasks.TaskSessionEvent;
import com.google.android.gms.internal.measurement.m;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j0l extends i0l {
    public static String O0(mjk mjkVar) {
        Uri.Builder builder = new Uri.Builder();
        String strJ = mjkVar.j();
        if (TextUtils.isEmpty(strJ)) {
            strJ = mjkVar.d();
        }
        builder.scheme((String) zvj.f.a(null)).encodedAuthority((String) zvj.g.a(null)).path("config/app/" + strJ).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "102001").appendQueryParameter("runtime_version", TaskSessionEvent.REPLAY_FROM_START);
        return builder.build().toString();
    }

    public final l0l P0(String str) {
        mjk mjkVarG1;
        i4l.a();
        l0l l0lVar = null;
        if (((umk) this.E).K.X0(null, zvj.v0)) {
            J0();
            if (h1l.N1(str)) {
                b0().R.b("sgtm feature flag enabled.");
                mjk mjkVarG12 = M0().G1(str);
                if (mjkVarG12 == null) {
                    return new l0l(Q0(str), 1);
                }
                String strG = mjkVarG12.g();
                m mVarC1 = N0().c1(str);
                if (mVarC1 == null || (mjkVarG1 = M0().G1(str)) == null || ((!mVarC1.I() || mVarC1.y().p() != 100) && !J0().L1(str, mjkVarG1.l()) && (TextUtils.isEmpty(strG) || strG.hashCode() % 100 >= mVarC1.y().p()))) {
                    return new l0l(Q0(str), 1);
                }
                if (mjkVarG12.p()) {
                    b0().R.b("sgtm upload enabled in manifest.");
                    m mVarC12 = N0().c1(mjkVarG12.f());
                    if (mVarC12 != null && mVarC12.I()) {
                        String strT = mVarC12.y().t();
                        if (!TextUtils.isEmpty(strT)) {
                            String strS = mVarC12.y().s();
                            b0().R.a(strT, TextUtils.isEmpty(strS) ? "Y" : "N", "sgtm configured with upload_url, server_info");
                            if (TextUtils.isEmpty(strS)) {
                                l0lVar = new l0l(strT, 3);
                            } else {
                                HashMap map = new HashMap();
                                map.put("x-sgtm-server-info", strS);
                                if (!TextUtils.isEmpty(mjkVarG12.l())) {
                                    map.put("x-gtm-server-preview", mjkVarG12.l());
                                }
                                l0lVar = new l0l(strT, map);
                            }
                        }
                    }
                }
                if (l0lVar != null) {
                    return l0lVar;
                }
            }
        }
        return new l0l(Q0(str), 1);
    }

    public final String Q0(String str) {
        String strG1 = N0().g1(str);
        if (TextUtils.isEmpty(strG1)) {
            return (String) zvj.r.a(null);
        }
        Uri uri = Uri.parse((String) zvj.r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strG1 + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }
}
