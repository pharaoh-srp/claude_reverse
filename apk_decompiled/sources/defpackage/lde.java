package defpackage;

import com.anthropic.claude.core.telemetry.ClaudeRegionUnavailableException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class lde implements f89 {
    public static final ide E;

    static {
        String strQuote = Pattern.quote("/app-unavailable-in-region");
        strQuote.getClass();
        E = new ide("<link(?=[^>]*rel=[\"']canonical[\"'])[^>]*href=[\"']https://(?:www\\.)?(?:anthropic\\.com|claude\\.com|claude\\.ai)" + strQuote + "/?[\"']", jde.IGNORE_CASE);
    }

    @Override // defpackage.f89
    public final pqe c(v4e v4eVar) throws ClaudeRegionUnavailableException {
        pqe pqeVarB = v4eVar.b(v4eVar.e);
        boolean zA = false;
        if (!x44.r(bsg.n1(pqeVarB.E.a.b(), '/'), "/app-unavailable-in-region")) {
            String strA = pqeVarB.J.a("Content-Type");
            if (strA == null) {
                strA = null;
            }
            if (strA != null && isg.q0(strA, "text/html", true)) {
                zA = E.a(pqeVarB.d(65536L).f());
            }
            if (!zA) {
                return pqeVarB;
            }
        }
        pqeVarB.close();
        throw new ClaudeRegionUnavailableException();
    }
}
