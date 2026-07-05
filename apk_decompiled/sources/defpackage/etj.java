package defpackage;

import android.text.format.DateUtils;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.share.ChatSnapshotSummaryWithChatId;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.types.strings.ChatSnapshotId;
import com.pvporbit.freetype.FreeTypeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class etj {
    public static final ta4 a = new ta4(1888107519, false, new m14(14));
    public static final ta4 b = new ta4(-922275837, false, new m14(15));
    public static final ta4 c = new ta4(-1624871676, false, new m14(16));
    public static final int[] d = {1, 10, 100, 1000, yr6.INVALID_OWNERSHIP, 100000, 1000000, 10000000, 100000000, 1000000000};

    public static final void a(zy7 zy7Var, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1623523878);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.h(zy7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b2 = 0;
        int i3 = 1;
        if (e18Var2.Q(i2 & 1, (i2 & 3) != 2)) {
            eli eliVar = (eli) e18Var2.j(ve4.t);
            e18Var = e18Var2;
            ppk.a(zy7Var, fd9.q0(-2110851438, new sxa(zy7Var, 13, b2), e18Var2), null, null, null, nrk.e, fd9.q0(-1265132563, new kxc(eliVar, i3), e18Var2), null, gm3.a(e18Var2).o, 0L, gm3.a(e18Var2).M, gm3.a(e18Var2).N, null, e18Var, (i2 & 14) | 1769520, 0, 12956);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new np1(i, 8, zy7Var);
        }
    }

    public static final void b(zy7 zy7Var, zy7 zy7Var2, ld4 ld4Var, int i) {
        int i2;
        e18 e18Var;
        zy7Var.getClass();
        zy7Var2.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1020798270);
        if ((i & 6) == 0) {
            i2 = i | (e18Var2.h(zy7Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.h(zy7Var2) ? 32 : 16;
        }
        byte b2 = 0;
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            eli eliVar = (eli) e18Var2.j(ve4.t);
            e18Var = e18Var2;
            ppk.a(zy7Var2, fd9.q0(1924950394, new sxa(zy7Var, 11, b2), e18Var2), null, fd9.q0(1001782968, new sxa(zy7Var2, 12, b2), e18Var2), null, nrk.c, fd9.q0(1764515477, new kxc(eliVar, b2), e18Var2), null, gm3.a(e18Var2).o, 0L, gm3.a(e18Var2).M, gm3.a(e18Var2).N, null, e18Var, ((i2 >> 3) & 14) | 1772592, 0, 12948);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new a66(i, 1, zy7Var, zy7Var2);
        }
    }

    public static final void c(String str, z02 z02Var, iqb iqbVar, ld4 ld4Var, int i) {
        e18 e18Var;
        iqb iqbVar2;
        str.getClass();
        z02Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-294113534);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(z02Var) ? 32 : 16) | 384;
        if (e18Var2.Q(i2 & 1, (i2 & 147) != 146)) {
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            tjh.b(str, fqbVar, 0L, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, z02Var.c(e18Var2), e18Var, (i2 & 14) | 48, 24960, 110588);
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new m6(str, i, z02Var, iqbVar2, 18);
        }
    }

    public static final void d(String str, hdc hdcVar, o3f o3fVar, iqb iqbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        str.getClass();
        hdcVar.getClass();
        o3fVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1393452893);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(hdcVar) ? 32 : 16) | (e18Var.f(o3fVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            String strQuote = JSONObject.quote(d4c.j0(R.string.office_preview_error, e18Var));
            xb5.a(str, hdcVar, csg.V("\n        <!DOCTYPE html>\n        <html>\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n            <style>\n                /* Real ClaudeTheme values are injected at runtime via setProperty();\n                   these defaults only cover the pre-injection frame. */\n                :root {\n                    --bg: transparent;\n                    --fg: #1a1a1a;\n                    --fg-muted: #6b6b6b;\n                    --border: #d9d9d9;\n                    --header-bg: #ededed;\n                }\n                html, body {\n                    margin: 0;\n                    padding: 0;\n                    background: var(--bg);\n                    color: var(--fg);\n                    font: 15px/1.5 -apple-system, system-ui, sans-serif;\n                    -webkit-text-size-adjust: 100%;\n                    overflow-wrap: break-word;\n                }\n                #status { padding: 24px 16px; color: var(--fg-muted); text-align: center; }\n                #doc { padding: 16px 20px 32px; max-width: 720px; margin: 0 auto; }\n                /* mammoth emits semantic HTML with no inline styles, so this sheet is the\n                   sole source of presentation. */\n                h1, h2, h3, h4, h5, h6 {\n                    line-height: 1.25;\n                    margin: 1.2em 0 0.5em;\n                    font-weight: 600;\n                }\n                h1 { font-size: 1.6em; }\n                h2 { font-size: 1.4em; }\n                h3 { font-size: 1.2em; }\n                h4, h5, h6 { font-size: 1.05em; }\n                p { margin: 0 0 0.9em; }\n                ul, ol { margin: 0 0 0.9em; padding-left: 1.6em; }\n                li { margin-bottom: 0.25em; }\n                li > p { margin-bottom: 0.25em; }\n                /* External links are inert in this preview (SafeWebViewClient blocks all\n                   navigation), so don't render them as tappable. */\n                a { color: inherit; text-decoration: none; }\n                strong { font-weight: 600; }\n                img { max-width: 100%; height: auto; margin: 0.5em 0; }\n                hr { border: none; border-top: 1px solid var(--border); margin: 1.2em 0; }\n                blockquote {\n                    margin: 0 0 0.9em;\n                    padding: 0.2em 0 0.2em 1em;\n                    border-left: 3px solid var(--border);\n                    color: var(--fg-muted);\n                }\n                pre, code { font-family: ui-monospace, Menlo, monospace; font-size: 0.92em; }\n                table {\n                    border-collapse: collapse;\n                    margin: 0 0 1em;\n                    width: 100%;\n                    display: block;\n                    overflow-x: auto;\n                }\n                td, th {\n                    border: 1px solid var(--border);\n                    padding: 6px 10px;\n                    text-align: left;\n                    vertical-align: top;\n                }\n                th, thead td { background: var(--header-bg); font-weight: 600; }\n                table p { margin: 0; }\n            </style>\n            <script src=\"https://cdn.jsdelivr.net/npm/mammoth@1.8.0/mammoth.browser.min.js\"></script>\n        </head>\n        <body>\n            <div id=\"status\" style=\"display:none\"></div>\n            <div id=\"doc\"></div>\n            <script>\n                (function() {\n                    var status = document.getElementById('status');\n                    var doc = document.getElementById('doc');\n                    var postToNative = function(m) { " + xb5.m() + "; };\n                    function fail(e) {\n                        status.style.display = '';\n                        status.textContent = " + strQuote + ";\n                        doc.textContent = (e && e.message) || String(e);\n                        doc.style.cssText = 'padding:0 20px;color:var(--fg-muted);';\n                        postToNative({ type: 'error', message: (e && e.message) || String(e) });\n                    }\n                    // Stream the body and abort once the running total crosses the cap, so an\n                    // oversize file with no Content-Length never lands whole in the JS heap.\n                    // Chunks are concatenated into a single Uint8Array — docx is a ZIP, so\n                    // mammoth needs the full buffer before it can unpack anything.\n                    function fetchCapped(url, cap) {\n                        return fetch(url).then(function(r) {\n                            if (!r.ok) throw new Error('HTTP ' + r.status);\n                            var reader = r.body.getReader();\n                            var chunks = [], total = 0;\n                            return (function pump() {\n                                return reader.read().then(function(res) {\n                                    if (res.done) {\n                                        var out = new Uint8Array(total), off = 0;\n                                        for (var i = 0; i < chunks.length; i++) {\n                                            out.set(chunks[i], off);\n                                            off += chunks[i].length;\n                                        }\n                                        return out;\n                                    }\n                                    total += res.value.length;\n                                    if (total > cap) {\n                                        reader.cancel();\n                                        throw new Error('File too large to preview (' + total + ' bytes)');\n                                    }\n                                    chunks.push(res.value);\n                                    return pump();\n                                });\n                            })();\n                        });\n                    }\n                    fetchCapped('https://officeproxy.local/file', 10485760)\n                        .then(function(buf) { return mammoth.convertToHtml({ arrayBuffer: buf.buffer }); })\n                        .then(function(r) {\n                            // The wire cap bounds the compressed ZIP, not the converted HTML —\n                            // XML inflation and per-reference image inlining can multiply it, so\n                            // bound the total string and the image-free markup before handing\n                            // either to the DOM. The strip regex is case-insensitive because the\n                            // data-URI mediatype comes verbatim from the docx package.\n                            if (r.value.length > 20000000) {\n                                throw new Error('Converted HTML too large (' + r.value.length + ' chars)');\n                            }\n                            var markupLen = r.value.replace(/\"data:image\\/[^\"]*\"/gi, '\"\"').length;\n                            if (markupLen > 2000000) {\n                                throw new Error('Converted markup too large (' + markupLen + ' chars)');\n                            }\n                            // mammoth emits a fixed set of structural tags from the document\n                            // model — no <script> or event-handler passthrough — and the page\n                            // runs in a sandboxed, opaque-origin WebView with navigation and\n                            // non-allowlisted network loads blocked. The one tainted attribute is\n                            // <a href>: mammoth passes docx hyperlink targets through verbatim, so\n                            // drop any scheme other than http(s) or a same-document #fragment before\n                            // it can run on tap. shouldOverrideUrlLoading doesn't reliably block\n                            // javascript: URIs across WebView builds, so this page-level strip is\n                            // the dependable layer; #fragment is kept so TOC/footnote links scroll.\n                            doc.innerHTML = r.value;\n                            var links = doc.querySelectorAll('a[href]');\n                            for (var i = 0; i < links.length; i++) {\n                                if (!/^(https?:|#)/i.test(links[i].getAttribute('href') || '')) {\n                                    links[i].removeAttribute('href');\n                                }\n                            }\n                            // Signal native layer so it can fade out the loading spinner.\n                            postToNative({ type: 'loaded' });\n                        })\n                        .catch(fail);\n                })();\n            </script>\n        </body>\n        </html>\n    "), sf5.f0("https://cdn.jsdelivr.net/npm/mammoth@1.8.0/mammoth.browser.min.js"), o3fVar, iqbVar, 10485760L, zy7Var, null, e18Var, (i2 & 14) | 1575936 | (i2 & 112) | (57344 & (i2 << 6)) | 196608 | ((i2 << 9) & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ba6(str, hdcVar, o3fVar, iqbVar, zy7Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final com.anthropic.claude.tool.model.KnowledgeSource r42, final defpackage.iqb r43, float r44, long r45, defpackage.tkh r47, int r48, defpackage.tkh r49, defpackage.tkh r50, int r51, defpackage.mnc r52, defpackage.ld4 r53, final int r54, final int r55) {
        /*
            Method dump skipped, instruction units count: 1144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etj.e(com.anthropic.claude.tool.model.KnowledgeSource, iqb, float, long, tkh, int, tkh, tkh, int, mnc, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.anthropic.claude.sessions.types.PermissionMode r38, java.lang.String r39, java.lang.String r40, boolean r41, defpackage.zy7 r42, boolean r43, defpackage.ld4 r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etj.f(com.anthropic.claude.sessions.types.PermissionMode, java.lang.String, java.lang.String, boolean, zy7, boolean, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0223  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(com.anthropic.claude.sessions.types.PermissionMode r19, defpackage.s71 r20, defpackage.bz7 r21, defpackage.zy7 r22, defpackage.i4g r23, defpackage.ld4 r24, int r25) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.etj.g(com.anthropic.claude.sessions.types.PermissionMode, s71, bz7, zy7, i4g, ld4, int):void");
    }

    public static final void h(int i, ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(156116805);
        if (e18Var.Q(i & 1, i != 0)) {
            iqb iqbVarL = gb9.L(yfd.p(xn5.V(gb9.I(b.c, j9a.a), xve.b(12.0f)), gm3.a(e18Var).y, zni.b), 16.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 2);
            o5b o5bVarD = dw1.d(lja.L, false);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, iqbVarL);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, o5bVarD);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            cv8.b(a.a(ud0.M1, e18Var), d4c.j0(R.string.shared_links_unshare_button, e18Var), null, gm3.a(e18Var).F, e18Var, 8, 4);
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new qte(i);
        }
    }

    public static final void i(ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatId, bz7 bz7Var, zy7 zy7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(2040216433);
        int i2 = 4;
        int i3 = i | (e18Var2.f(chatSnapshotSummaryWithChatId) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.h(zy7Var) ? 256 : FreeTypeConstants.FT_LOAD_PEDANTIC);
        if (e18Var2.Q(i3 & 1, (i3 & 147) != 146)) {
            String strJ0 = d4c.j0(R.string.shared_links_unshare_button, e18Var2);
            fqb fqbVar = fqb.E;
            iqb iqbVarV = xn5.V(ez1.t(gb9.I(b.c(fqbVar, 1.0f), j9a.a), 0.5f, gm3.a(e18Var2).u, xve.b(12.0f)), xve.b(12.0f));
            vue vueVar = new vue(0);
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (z || objN == lz1Var) {
                objN = new ytf(bz7Var, i2, chatSnapshotSummaryWithChatId);
                e18Var2.k0(objN);
            }
            iqb iqbVarC = androidx.compose.foundation.b.c(iqbVarV, false, null, vueVar, null, (zy7) objN, 11);
            boolean zF = ((i3 & 896) == 256) | e18Var2.f(strJ0);
            Object objN2 = e18Var2.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new go3(2, zy7Var, strJ0);
                e18Var2.k0(objN2);
            }
            iqb iqbVarJ = gb9.J(yfd.p(tjf.b(iqbVarC, false, (bz7) objN2), gm3.a(e18Var2).p, zni.b), 12.0f);
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
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
            tjh.b(chatSnapshotSummaryWithChatId.getSnapshot_name(), null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, 0, 24960, 110586);
            CharSequence relativeTimeSpanString = DateUtils.getRelativeTimeSpanString(chatSnapshotSummaryWithChatId.getCreated_at().getTime(), System.currentTimeMillis(), 60000L);
            relativeTimeSpanString.getClass();
            tjh.b(d4c.k0(R.string.shared_links_time_ago, new Object[]{relativeTimeSpanString}, e18Var2), gb9.N(fqbVar, MTTypesetterKt.kLineSkipLimitMultiplier, 4.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13), gm3.a(e18Var2).O, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 48, 24960, 110584);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new tfe(chatSnapshotSummaryWithChatId, i, bz7Var, zy7Var, 11);
        }
    }

    public static final void j(s2g s2gVar, bz7 bz7Var, ld4 ld4Var, int i) {
        e18 e18Var;
        lz1 lz1Var;
        boolean z;
        int i2;
        String snapshot_name;
        s2g s2gVar2 = s2gVar;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(1239008525);
        int i3 = (e18Var2.f(s2gVar2) ? 4 : 2) | i | (e18Var2.h(bz7Var) ? 32 : 16);
        if (e18Var2.Q(i3 & 1, (i3 & 19) != 18)) {
            gf8 gf8Var = (gf8) e18Var2.j(ve4.l);
            ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatIdP = s2gVar2.P();
            lz1 lz1Var2 = jd4.a;
            if (chatSnapshotSummaryWithChatIdP != null) {
                e18Var2.a0(354244538);
                ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatIdP2 = s2gVar2.P();
                tp4 tp4Var = null;
                String strM434getUuidN1vkeFQ = chatSnapshotSummaryWithChatIdP2 != null ? chatSnapshotSummaryWithChatIdP2.m434getUuidN1vkeFQ() : null;
                ChatSnapshotId chatSnapshotIdM985boximpl = strM434getUuidN1vkeFQ != null ? ChatSnapshotId.m985boximpl(strM434getUuidN1vkeFQ) : null;
                boolean zH = e18Var2.h(gf8Var);
                Object objN = e18Var2.N();
                if (zH || objN == lz1Var2) {
                    objN = new l6b(gf8Var, tp4Var, 11);
                    e18Var2.k0(objN);
                }
                fd9.i(e18Var2, (pz7) objN, chatSnapshotIdM985boximpl);
                int i4 = i3 & 14;
                boolean z2 = i4 == 4;
                Object objN2 = e18Var2.N();
                if (z2 || objN2 == lz1Var2) {
                    i2 = i4;
                    lz1Var = lz1Var2;
                    ogf ogfVar = new ogf(0, s2gVar2, s2g.class, "onLinkDeleted", "onLinkDeleted()V", 0, 5);
                    e18Var2.k0(ogfVar);
                    objN2 = ogfVar;
                } else {
                    i2 = i4;
                    lz1Var = lz1Var2;
                }
                zy7 zy7Var = (zy7) ((jm9) objN2);
                boolean z3 = i2 == 4;
                Object objN3 = e18Var2.N();
                if (z3 || objN3 == lz1Var) {
                    ogf ogfVar2 = new ogf(0, s2gVar, s2g.class, "onLinkDeleteDismissed", "onLinkDeleteDismissed()V", 0, 6);
                    e18Var2.k0(ogfVar2);
                    objN3 = ogfVar2;
                }
                zy7 zy7Var2 = (zy7) ((jm9) objN3);
                String strJ0 = d4c.j0(R.string.shared_links_unshare_dialog_title, e18Var2);
                String strJ02 = d4c.j0(R.string.shared_links_unshare_button, e18Var2);
                ChatSnapshotSummaryWithChatId chatSnapshotSummaryWithChatIdP3 = s2gVar.P();
                if (chatSnapshotSummaryWithChatIdP3 == null || (snapshot_name = chatSnapshotSummaryWithChatIdP3.getSnapshot_name()) == null) {
                    snapshot_name = "";
                }
                z = false;
                e18Var = e18Var2;
                rwk.d(s2gVar, zy7Var, zy7Var2, strJ0, strJ02, d4c.k0(R.string.shared_links_unshare_dialog_description, new Object[]{snapshot_name}, e18Var2), 0, e18Var, i2, 64);
                s2gVar2 = s2gVar;
                e18Var.p(false);
            } else {
                lz1Var = lz1Var2;
                e18Var = e18Var2;
                z = false;
                e18Var.a0(354885525);
                e18Var.p(false);
            }
            qnc qncVar = j9a.a;
            qnc qncVarB = gb9.b(MTTypesetterKt.kLineSkipLimitMultiplier, 12.0f, 1);
            boolean z4 = z;
            FillElement fillElement = b.c;
            boolean z5 = ((i3 & 14) == 4 ? true : z4) | ((i3 & 112) != 32 ? z4 : true);
            Object objN4 = e18Var.N();
            if (z5 || objN4 == lz1Var) {
                objN4 = new nif(s2gVar2, 4, bz7Var);
                e18Var.k0(objN4);
            }
            knk.h(fillElement, null, qncVarB, false, null, null, null, false, null, (bz7) objN4, e18Var, 6, 506);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ufe(s2gVar2, bz7Var, i);
        }
    }

    public static final void k(zy7 zy7Var, bz7 bz7Var, iqb iqbVar, s2g s2gVar, ld4 ld4Var, int i) {
        iqb iqbVar2;
        s2g s2gVar2;
        s2g s2gVar3;
        int i2;
        iqb iqbVar3;
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(1844163886);
        int i3 = i | (e18Var.h(zy7Var) ? 4 : 2) | (e18Var.h(bz7Var) ? 32 : 16) | 1408;
        int i4 = 0;
        if (e18Var.Q(i3 & 1, (i3 & 1171) != 1170)) {
            e18Var.V();
            int i5 = i & 1;
            lz1 lz1Var = jd4.a;
            if (i5 == 0 || e18Var.A()) {
                m7f m7fVar = (m7f) e18Var.j(gr9.b);
                boolean zH = e18Var.h(m7fVar);
                Object objN = e18Var.N();
                if (zH || objN == lz1Var) {
                    objN = new t2g(m7fVar, i4);
                    e18Var.k0(objN);
                }
                kce kceVar = jce.a;
                s2gVar3 = (s2g) fd9.r0(kceVar.b(s2g.class), oq5.B(kceVar.b(s2g.class)), (bz7) objN, e18Var);
                i2 = i3 & (-7169);
                iqbVar3 = fqb.E;
            } else {
                e18Var.T();
                i2 = i3 & (-7169);
                iqbVar3 = iqbVar;
                s2gVar3 = s2gVar;
            }
            e18Var.q();
            boolean zF = e18Var.f(s2gVar3);
            Object objN2 = e18Var.N();
            if (zF || objN2 == lz1Var) {
                objN2 = new jp(s2gVar3, null, 9);
                e18Var.k0(objN2);
            }
            csg.g((bz7) objN2, e18Var, 0, 1);
            iqb iqbVar4 = iqbVar3;
            ssj.c(d4c.j0(R.string.shared_links_section_title, e18Var), zy7Var, iqbVar4, null, null, 0L, fd9.q0(205391037, new u3e(s2gVar3, 8, bz7Var), e18Var), e18Var, ((i2 << 3) & 112) | 1573248, 56);
            s2gVar2 = s2gVar3;
            iqbVar2 = iqbVar4;
        } else {
            e18Var.T();
            iqbVar2 = iqbVar;
            s2gVar2 = s2gVar;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new v3e(zy7Var, bz7Var, iqbVar2, s2gVar2, i);
        }
    }

    public static final int n(tka tkaVar) {
        tkaVar.getClass();
        if (tkaVar.isEmpty()) {
            return 0;
        }
        try {
            long jAddExact = (Math.addExact(tkaVar.F, -tkaVar.E) / tkaVar.G) + 1;
            if (jAddExact > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (jAddExact < -2147483648L) {
                return Integer.MIN_VALUE;
            }
            return (int) jAddExact;
        } catch (ArithmeticException unused) {
            return Integer.MAX_VALUE;
        }
    }

    public abstract String l(byte[] bArr, int i, int i2);

    public abstract int m(String str, byte[] bArr, int i, int i2);

    public boolean o(byte[] bArr, int i, int i2) {
        return p(bArr, i, i2) == 0;
    }

    public abstract int p(byte[] bArr, int i, int i2);
}
