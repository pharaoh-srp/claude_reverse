package defpackage;

import android.os.Bundle;
import com.anthropic.claude.R;
import com.anthropic.claude.mcpapps.McpAppApi$McpAppFetchException;
import com.anthropic.claude.mcpapps.McpAppApi$ShttpException;
import com.anthropic.claude.sessions.types.SessionFileAttachment;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aok {
    public static final ta4 a = new ta4(-1152725896, false, new rb4(27));

    public static final void a(int i, ld4 ld4Var, zy7 zy7Var, zy7 zy7Var2, iqb iqbVar) {
        int i2;
        zy7 zy7Var3;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-667837601);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (e18Var.Q(i3 & 1, (i3 & 147) != 146)) {
            Object objN = e18Var.N();
            if (objN == jd4.a) {
                objN = new oob(19);
                e18Var.k0(objN);
            }
            zy7 zy7Var4 = (zy7) objN;
            fqb fqbVar = fqb.E;
            zy7Var3 = zy7Var;
            xuk.c(d4c.j0(R.string.notification_upsell_title, e18Var), d4c.j0(R.string.notification_upsell_button, e18Var), zy7Var3, zy7Var4, fqbVar, ctk.a, null, e18Var, ((i3 << 6) & 896) | 224256, 64);
            zy7Var2 = zy7Var4;
            iqbVar = fqbVar;
        } else {
            zy7Var3 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new hy1(i, zy7Var3, zy7Var2, iqbVar);
        }
    }

    public static final ArrayList b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ulj uljVar = (ulj) it.next();
            Bundle bundle = new Bundle();
            uljVar.getClass();
            bundle.putInt("event_type", 3);
            bundle.putLong("event_timestamp", uljVar.a);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final float c(float f, p3f p3fVar) {
        return Float.isNaN(f) ? ((Number) p3fVar.a()).floatValue() : f;
    }

    public static final fk d(SessionFileAttachment sessionFileAttachment) {
        return new fk(sessionFileAttachment.getFile_name(), (Long) null, sessionFileAttachment.is_image(), (String) null, sessionFileAttachment.getFile_uuid(), 10);
    }

    public static final void e(ArrayList arrayList) {
        arrayList.add(new ulj(System.currentTimeMillis()));
    }

    public static final boolean f(int i) {
        return i == 1 || i == 2;
    }

    public static final ejh g(ejh ejhVar, ejh ejhVar2, float f) {
        boolean z = ejhVar instanceof ly1;
        djh djhVar = djh.a;
        if (!z && !(ejhVar2 instanceof ly1)) {
            long jY = d4c.Y(f, ejhVar.b(), ejhVar2.b());
            return jY != 16 ? new v54(jY) : djhVar;
        }
        if (!z || !(ejhVar2 instanceof ly1)) {
            return (ejh) fgg.b(ejhVar, ejhVar2, f);
        }
        ly1 ly1Var = (ly1) ejhVar;
        ly1 ly1Var2 = (ly1) ejhVar2;
        jy1 jy1Var = (jy1) fgg.b(ly1Var.a, ly1Var2.a, f);
        float fW = d4c.W(ly1Var.b, ly1Var2.b, f);
        if (jy1Var == null) {
            return djhVar;
        }
        if (jy1Var instanceof eeg) {
            long j = j(fW, ((eeg) jy1Var).a);
            return j != 16 ? new v54(j) : djhVar;
        }
        if (jy1Var instanceof rzf) {
            return new ly1((rzf) jy1Var, fW);
        }
        wg6.i();
        return null;
    }

    public static final Integer h(Throwable th) {
        th.getClass();
        if (th instanceof McpAppApi$McpAppFetchException) {
            return ((McpAppApi$McpAppFetchException) th).F;
        }
        if (th instanceof McpAppApi$ShttpException) {
            return Integer.valueOf(((McpAppApi$ShttpException) th).E);
        }
        return null;
    }

    public static final String i(Throwable th) {
        th.getClass();
        String strF = jce.a.b(th.getClass()).f();
        return strF == null ? "Unknown" : strF;
    }

    public static final long j(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : d54.b(d54.d(j) * f, j);
    }

    public static final CharSequence k(efh efhVar, lja ljaVar, h79 h79Var) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < efhVar.G.length()) {
            int iCodePointAt = Character.codePointAt(efhVar, i);
            ljaVar.getClass();
            int i2 = iCodePointAt == 10 ? 32 : iCodePointAt == 13 ? 65279 : iCodePointAt;
            int iCharCount = Character.charCount(iCodePointAt);
            if (i2 != iCodePointAt) {
                h79Var.i(sb.length(), sb.length() + iCharCount, Character.charCount(i2));
                z = true;
            }
            sb.appendCodePoint(i2);
            i += iCharCount;
        }
        return z ? sb.toString() : efhVar;
    }
}
