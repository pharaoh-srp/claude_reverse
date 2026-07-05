package defpackage;

import com.anthropic.claude.R;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qwj {
    public static final ta4 a = new ta4(400684597, false, new bb4(6));
    public static final o54 b;
    public static final float c;

    static {
        new ta4(-731781173, false, new bb4(10));
        new ta4(310002360, false, new bb4(11));
        new ta4(1967820989, false, new bb4(12));
        new ta4(-1934557413, false, new bb4(13));
        new ta4(-295029933, false, new bb4(14));
        new ta4(-381960620, false, new bb4(7));
        new ta4(-1350852136, false, new bb4(8));
        new ta4(-1392081362, false, new bb4(9));
        b = o54.M;
        c = 0.38f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Type inference failed for: r28v0, types: [bz7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Number] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.iqb r21, defpackage.mnc r22, defpackage.rz7 r23, defpackage.sz7 r24, defpackage.rz7 r25, defpackage.wp6 r26, defpackage.d77 r27, defpackage.bz7 r28, defpackage.ld4 r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.a(iqb, mnc, rz7, sz7, rz7, wp6, d77, bz7, ld4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final java.lang.String r30, final java.lang.String r31, final boolean r32, final boolean r33, final defpackage.zy7 r34, final defpackage.zy7 r35, final defpackage.zy7 r36, defpackage.iqb r37, java.lang.String r38, defpackage.ybg r39, defpackage.sed r40, defpackage.ld4 r41, final int r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qwj.b(java.lang.String, java.lang.String, boolean, boolean, zy7, zy7, zy7, iqb, java.lang.String, ybg, sed, ld4, int, int):void");
    }

    public static final void c(String str, hdc hdcVar, o3f o3fVar, iqb iqbVar, zy7 zy7Var, ld4 ld4Var, int i) {
        str.getClass();
        hdcVar.getClass();
        o3fVar.getClass();
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-986104233);
        int i2 = i | (e18Var.f(str) ? 4 : 2) | (e18Var.h(hdcVar) ? 32 : 16) | (e18Var.f(o3fVar) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC) | (e18Var.h(zy7Var) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var.Q(i2 & 1, (i2 & 9363) != 9362)) {
            String strJ0 = d4c.j0(R.string.office_preview_error, e18Var);
            String strK0 = d4c.k0(R.string.spreadsheet_preview_truncated, new Object[]{5000}, e18Var);
            String strQuote = JSONObject.quote(strJ0);
            String strQuote2 = JSONObject.quote(strK0);
            StringBuilder sbR = kgh.r("\n        <!DOCTYPE html>\n        <html>\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n            <style>\n                /* Real ClaudeTheme values are injected at runtime via setProperty();\n                   these defaults only cover the pre-injection frame. */\n                :root {\n                    --bg: transparent;\n                    --fg: #1a1a1a;\n                    --fg-muted: #6b6b6b;\n                    --border: #d9d9d9;\n                    --header-bg: #ededed;\n                }\n                html, body {\n                    height: 100%;\n                    margin: 0;\n                    padding: 0;\n                    background: var(--bg);\n                    color: var(--fg);\n                    font: 13px -apple-system, system-ui, sans-serif;\n                    -webkit-text-size-adjust: 100%;\n                }\n                /* Column layout so #sheet fills the remaining viewport height below #status\n                   and becomes a real scroll container — otherwise overflow:auto on an\n                   unconstrained #sheet makes it the sticky containing block without ever\n                   scrolling, and the header row's position:sticky never activates. */\n                body { display: flex; flex-direction: column; }\n                #tabs {\n                    display: flex;\n                    overflow-x: auto;\n                    border-bottom: 1px solid var(--border);\n                    flex: none;\n                }\n                #tabs button {\n                    flex: none;\n                    font: inherit;\n                    color: var(--fg-muted);\n                    background: none;\n                    border: none;\n                    border-bottom: 2px solid transparent;\n                    padding: 10px 14px;\n                    white-space: nowrap;\n                }\n                #tabs button.active {\n                    color: var(--fg);\n                    border-bottom-color: var(--fg);\n                }\n                #sheet { flex: 1; min-height: 0; padding: 0; overflow: auto; }\n                #status { padding: 24px 16px; color: var(--fg-muted); text-align: center; }\n                table { border-collapse: collapse; table-layout: auto; min-width: 100%; }\n                td, th {\n                    border: 1px solid var(--border);\n                    padding: 6px 10px;\n                    text-align: left;\n                    white-space: nowrap;\n                    max-width: 320px;\n                    overflow: hidden;\n                    text-overflow: ellipsis;\n                    vertical-align: top;\n                }\n                /* sheet_to_html emits the first row as <td>, not <th>, so style by position. */\n                tr:first-child td, th {\n                    background: var(--header-bg);\n                    font-weight: 600;\n                    position: sticky;\n                    top: -1px;\n                }\n            </style>\n            <script src=\"https://cdn.sheetjs.com/xlsx-0.20.3/package/dist/xlsx.full.min.js\"></script>\n        </head>\n        <body>\n            <div id=\"tabs\" style=\"display:none\"></div>\n            <div id=\"status\"></div>\n            <div id=\"sheet\"></div>\n            <script>\n                (function() {\n                    var status = document.getElementById('status');\n                    var tabs = document.getElementById('tabs');\n                    var sheet = document.getElementById('sheet');\n                    var postToNative = function(m) { ", xb5.m(), "; };\n                    status.style.display = 'none';\n                    function fail(e) {\n                        status.style.display = '';\n                        status.textContent = ", strQuote, ";\n                        sheet.textContent = (e && e.message) || String(e);\n                        sheet.style.cssText = 'padding:0 16px;color:var(--fg-muted);';\n                        postToNative({ type: 'error', message: (e && e.message) || String(e) });\n                    }\n                    // Stream the body and abort once the running total crosses the cap, so\n                    // an oversize file with no Content-Length never lands whole in JS heap.\n                    // Chunks are concatenated into a single Uint8Array for XLSX.read — xlsx\n                    // is a ZIP, so SheetJS needs the full buffer to find the central directory.\n                    function fetchCapped(url, cap) {\n                        return fetch(url).then(function(r) {\n                            if (!r.ok) throw new Error('HTTP ' + r.status);\n                            var reader = r.body.getReader();\n                            var chunks = [], total = 0;\n                            return (function pump() {\n                                return reader.read().then(function(res) {\n                                    if (res.done) {\n                                        var out = new Uint8Array(total), off = 0;\n                                        for (var i = 0; i < chunks.length; i++) {\n                                            out.set(chunks[i], off);\n                                            off += chunks[i].length;\n                                        }\n                                        return out;\n                                    }\n                                    total += res.value.length;\n                                    if (total > cap) {\n                                        reader.cancel();\n                                        throw new Error('File too large to preview (' + total + ' bytes)');\n                                    }\n                                    chunks.push(res.value);\n                                    return pump();\n                                });\n                            })();\n                        });\n                    }\n                    function render(wb, name) {\n                        var ws = wb.Sheets[name];\n                        // sheetRows parses one extra row as a sentinel, so range.e.r reaching\n                        // MAX_SPREADSHEET_ROWS means the sheet genuinely had more than the cap\n                        // (vs. happening to equal it exactly) and the banner is warranted.\n                        var savedRef = ws['!ref'];\n                        var range = savedRef ? XLSX.utils.decode_range(savedRef) : { s: { r: 0, c: 0 }, e: { r: 0, c: 0 } };\n                        var truncated = range.e.r + 1 > 5000;\n                        try {\n                            if (truncated) {\n                                // Clip the sentinel back off so the rendered table matches the banner's\n                                // row count. sheet_to_html reads '!ref' for its output range; try/finally\n                                // restores it so a re-render of this sheet re-evaluates truncation even if\n                                // sheet_to_html throws (render is called from tab onclick, outside .catch).\n                                ws['!ref'] = XLSX.utils.encode_range(range.s, { r: 5000 - 1, c: range.e.c });\n                            }\n                            // innerHTML is acceptable here: sheet_to_html HTML-escapes cell values, and\n                            // SafeWebViewClient blocks navigation and non-allowlisted subresources, so\n                            // injected markup has nothing to reach. The native bridge only reacts to a\n                            // fixed 'loaded'/'error' type field, so it's not a useful target either.\n                            sheet.innerHTML = XLSX.utils.sheet_to_html(ws, { header: '', footer: '' });\n                        } finally {\n                            ws['!ref'] = savedRef;\n                        }\n                        sheet.scrollTop = 0;\n                        sheet.scrollLeft = 0;\n                        status.style.display = truncated ? '' : 'none';\n                        if (truncated) status.textContent = ");
            sbR.append(strQuote2);
            sbR.append(";\n                        for (var i = 0; i < tabs.children.length; i++) {\n                            var active = tabs.children[i].textContent === name;\n                            tabs.children[i].className = active ? 'active' : '';\n                            tabs.children[i].setAttribute('aria-selected', String(active));\n                            if (active) sheet.setAttribute('aria-labelledby', tabs.children[i].id);\n                        }\n                    }\n                    fetchCapped('https://officeproxy.local/file', 31457280)\n                        .then(function(buf) {\n                            var wb = XLSX.read(buf, { type: 'array', sheetRows: 5000 + 1 });\n                            if (wb.SheetNames.length > 1) {\n                                tabs.style.display = '';\n                                tabs.setAttribute('role', 'tablist');\n                                sheet.setAttribute('role', 'tabpanel');\n                                wb.SheetNames.forEach(function(n, i) {\n                                    var b = document.createElement('button');\n                                    b.id = 'tab-' + i;\n                                    b.setAttribute('role', 'tab');\n                                    b.setAttribute('aria-controls', 'sheet');\n                                    b.textContent = n;\n                                    b.onclick = function() { render(wb, n); };\n                                    tabs.appendChild(b);\n                                });\n                            }\n                            render(wb, wb.SheetNames[0]);\n                            // Signal native layer so it can fade out the loading spinner.\n                            postToNative({ type: 'loaded' });\n                        })\n                        .catch(fail);\n                })();\n            </script>\n        </body>\n        </html>\n    ");
            xb5.a(str, hdcVar, csg.V(sbR.toString()), sf5.f0("https://cdn.sheetjs.com/xlsx-0.20.3/package/dist/xlsx.full.min.js"), o3fVar, iqbVar, 31457280L, zy7Var, null, e18Var, (i2 & 14) | 1575936 | (i2 & 112) | (57344 & (i2 << 6)) | 196608 | ((i2 << 9) & 29360128));
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ba6(str, hdcVar, o3fVar, iqbVar, zy7Var, i, 1);
        }
    }

    public static final vai d(vai vaiVar, qai qaiVar) {
        if (qaiVar == null || vaiVar.a() == 1) {
            return vaiVar;
        }
        if (qaiVar.z() != vaiVar.a()) {
            jc2 jc2Var = new jc2(vaiVar);
            r9i.F.getClass();
            return new wai(1, new gc2(vaiVar, jc2Var, false, r9i.G));
        }
        if (!vaiVar.c()) {
            return new wai(vaiVar.b());
        }
        xea xeaVar = gfa.e;
        xeaVar.getClass();
        return new wai(1, new z1a(xeaVar, new v01(6, vaiVar)));
    }

    public static js6 e(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("test_execution_id").m();
            strM.getClass();
            return new js6(strM);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type CiTest", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type CiTest", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type CiTest", e3);
            return null;
        }
    }

    public static iwi f(qh9 qh9Var) {
        try {
            return new iwi(qh9Var.s("timestamp").k());
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Fbc", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Fbc", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Fbc", e3);
            return null;
        }
    }

    public static o54 g() {
        return b;
    }

    public static float h() {
        return c;
    }

    public static bbi i(bbi bbiVar) {
        if (!(bbiVar instanceof a19)) {
            return new kc2(bbiVar, 0);
        }
        a19 a19Var = (a19) bbiVar;
        qai[] qaiVarArr = a19Var.b;
        ArrayList<cpc> arrayListA1 = mp0.a1(a19Var.c, qaiVarArr);
        ArrayList arrayList = new ArrayList(x44.y(arrayListA1, 10));
        for (cpc cpcVar : arrayListA1) {
            arrayList.add(d((vai) cpcVar.E, (qai) cpcVar.F));
        }
        return new a19(qaiVarArr, (vai[]) arrayList.toArray(new vai[0]), true);
    }
}
