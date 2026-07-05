package defpackage;

import android.net.Uri;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewKind;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zlk {
    public static final ta4 a = new ta4(1348584928, false, new sb4(0));

    public static final void a(String str, String str2, iqb iqbVar, boolean z, boolean z2, n3f n3fVar, ld4 ld4Var, int i, int i2) {
        int i3;
        boolean z3;
        e18 e18Var;
        boolean zF;
        n3f n3fVar2;
        boolean z4;
        int i4;
        str.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-753958067);
        if ((i & 6) == 0) {
            i3 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e18Var2.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                z3 = z;
                if (e18Var2.g(z3)) {
                    i4 = FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM;
                }
                i3 |= i4;
            } else {
                z3 = z;
            }
            i4 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
            i3 |= i4;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            i3 |= e18Var2.g(z2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if (e18Var2.Q(i3 & 1, (74899 & i3) != 74898)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                zF = (i2 & 8) != 0 ? v40.F(e18Var2) : z3;
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF2 || objN == lz1Var) {
                    objN = m7fVarN.a(jce.a.b(n3f.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                n3fVar2 = (n3f) objN;
            } else {
                e18Var2.T();
                zF = z3;
                n3fVar2 = n3fVar;
            }
            e18Var2.q();
            String str3 = zF ? "https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.10.0/styles/atom-one-dark.min.css" : "https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.10.0/styles/atom-one-light.min.css";
            boolean zF3 = e18Var2.f(str3);
            Object objN2 = e18Var2.N();
            if (zF3 || objN2 == lz1Var) {
                objN2 = new br3(str3, n3fVar2.a(WebViewEvents$WebViewKind.CODE));
                e18Var2.k0(objN2);
            }
            br3 br3Var = (br3) objN2;
            iqb iqbVarP = yfd.p(iqbVar, zF ? od7.a : od7.b, zni.b);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 6);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarP);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            gd1 gd1Var = id1.e;
            byte[] bytes = str.getBytes(dj2.a);
            bytes.getClass();
            String strB = id1.b(gd1Var, bytes);
            String strV = csg.V("\n        <!DOCTYPE html>\n        <html lang=\"en\">\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n            <style>\n                html, body {\n                    margin: 0;\n                    padding: 0;\n                    height: auto;\n                    width: 100%;\n                }\n                pre {\n                    margin: 0\n                }\n            </style>\n            <link rel=\"stylesheet\" href=\"" + str3 + "\">\n            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.10.0/highlight.min.js\"></script>\n        </head>\n        <body>\n            <pre><code id=\"content\"></code></pre>\n            <script>" + csg.V("\n        const result = " + (w44.G0(qx3.b, str2) ? ij0.l("hljs.highlight((function(base64String) {\n    const binaryString = atob(base64String);\n    const bytes = new Uint8Array(binaryString.length);\n    for (let i = 0; i < binaryString.length; i++) {\n        bytes[i] = binaryString.charCodeAt(i);\n    }\n    const decoder = new TextDecoder('utf-8');\n    const decodedString = decoder.decode(bytes);\n    return decodedString;\n})('", strB, "'), {language: '", str2, "'})") : ij0.j("hljs.highlightAuto((function(base64String) {\n    const binaryString = atob(base64String);\n    const bytes = new Uint8Array(binaryString.length);\n    for (let i = 0; i < binaryString.length; i++) {\n        bytes[i] = binaryString.charCodeAt(i);\n    }\n    const decoder = new TextDecoder('utf-8');\n    const decodedString = decoder.decode(bytes);\n    return decodedString;\n})('", strB, "'))")) + ";\n        const element = document.getElementById('content');\n        element.innerHTML = result.value;\n        element.classList.add(\"hljs\");\n        element.classList.add(\"language-\" + result.language);\n    ") + "</script>\n        </body>\n        </html>\n    ");
            iqb iqbVarB0 = fqb.E;
            if (z2) {
                e18Var2.a0(-2071464385);
                e18Var2.p(false);
                z4 = true;
            } else {
                e18Var2.a0(-2071463620);
                z4 = true;
                iqbVarB0 = mpk.b0(iqbVarB0, mpk.Y(e18Var2), true);
                e18Var2.p(false);
            }
            grk.a(strV, iqbVarB0, null, null, null, br3Var, true, false, e18Var2, 1572864, 156);
            e18Var = e18Var2;
            e18Var.p(z4);
        } else {
            e18Var = e18Var2;
            e18Var.T();
            zF = z3;
            n3fVar2 = n3fVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new lv2(str, str2, iqbVar, zF, z2, n3fVar2, i, i2);
        }
    }

    public static final void b(int i, ld4 ld4Var, zy7 zy7Var, iqb iqbVar, String str) {
        int i2;
        zy7 zy7Var2;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-70917754);
        if ((i & 6) == 0) {
            i2 = (e18Var.h(zy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var.f(iqbVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e18Var.f(str) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if (e18Var.Q(i2 & 1, (i2 & 147) != 146)) {
            e18Var.V();
            if ((i & 1) != 0 && !e18Var.A()) {
                e18Var.T();
            }
            e18Var.q();
            zy7Var2 = zy7Var;
            ez1.d(zy7Var2, b.o(iqbVar, 24.0f), false, null, vz8.E(gm3.a(e18Var).M, gm3.a(e18Var).n, e18Var, 24576), fd9.q0(1143742054, new yi7(str, 27), e18Var), e18Var, (i2 & 14) | 1572864, 44);
            e18Var = e18Var;
        } else {
            zy7Var2 = zy7Var;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new bk1(zy7Var2, iqbVar, str, i);
        }
    }

    public static final long c(long j) {
        float[] fArr = {MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier};
        int iN0 = d4c.n0(j);
        int i = x54.a;
        ga2.b(iN0, xyi.k, null, fArr);
        float fK = usj.k(iN0);
        fArr[2] = fK;
        return d4c.m(ga2.d(fArr[0], fArr[1], wd6.d0(fK + (fK > 50.0f ? 5.0f : -10.0f), MTTypesetterKt.kLineSkipLimitMultiplier, 100.0f)));
    }

    public static cb d(qh9 qh9Var) {
        try {
            Number numberL = qh9Var.s("width").l();
            Number numberL2 = qh9Var.s("height").l();
            numberL.getClass();
            numberL2.getClass();
            return new cb(numberL, numberL2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Viewport", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Viewport", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Viewport", e3);
            return null;
        }
    }

    public static ybh e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            strM.getClass();
            return new ybh(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type View", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type View", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type View", e3);
            return null;
        }
    }

    public static final kp7 f(ahj ahjVar, UUID uuid) {
        ahjVar.getClass();
        uuid.getClass();
        List listW = x44.W(String.valueOf(uuid));
        StringBuilder sbO = ij0.o("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        yfd.k(listW.size(), sbO);
        sbO.append(")");
        return j8.A(new vgj(ez1.x(ahjVar.a, true, new String[]{"WorkTag", "WorkProgress", "workspec"}, new f2d(sbO.toString(), listW, ahjVar, 28)), 1));
    }

    public static int g(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }
}
