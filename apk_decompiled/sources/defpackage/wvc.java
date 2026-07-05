package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.analytics.events.WebViewEvents$WebViewErrorStateShown;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wvc implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;

    public /* synthetic */ wvc(nwb nwbVar, bz7 bz7Var, lo3 lo3Var, bz7 bz7Var2) {
        this.E = 5;
        this.F = nwbVar;
        this.H = bz7Var;
        this.G = lo3Var;
        this.I = bz7Var2;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        NotificationManager notificationManager;
        switch (this.E) {
            case 0:
                vvc vvcVar = (vvc) this.G;
                bz7 bz7Var = (bz7) this.H;
                bz7 bz7Var2 = (bz7) this.I;
                nwb nwbVar = (nwb) this.F;
                Context context = (Context) obj;
                context.getClass();
                gj7 gj7Var = new gj7(context);
                gj7Var.getSettings().setSafeBrowsingEnabled(false);
                gj7Var.getSettings().setTextZoom(100);
                gj7Var.getSettings().setMinimumFontSize(1);
                Set setF0 = sf5.f0("*");
                if (q7j.a("WEB_MESSAGE_LISTENER")) {
                    j7j.a(gj7Var, "_claude_bridge", setF0, new lrb(gj7Var, bz7Var, bz7Var2, nwbVar));
                } else {
                    gj7Var.addJavascriptInterface(new xvc(gj7Var, bz7Var, bz7Var2, nwbVar), "_claude_bridge");
                }
                gj7Var.setWebViewClient(vvcVar);
                String string = context.getString(R.string.pdf_page_n_of_total, "{n}", "{total}");
                string.getClass();
                String strConcat = q7j.a("WEB_MESSAGE_LISTENER") ? "_claude_bridge".concat(".postMessage(JSON.stringify(m))") : "window._claude_bridge.postMessage(JSON.stringify(m))";
                gj7Var.loadDataWithBaseURL(null, csg.V("\n        <!DOCTYPE html>\n        <html>\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n            <style>\n                :root {\n                    --bottom-inset: 0px;\n                }\n                html, body {\n                    margin: 0;\n                    padding: 0;\n                    background: transparent;\n                }\n                .pdf-page {\n                    position: relative;\n                    margin: 8px auto;\n                    width: 100%;\n                    background: rgba(128, 128, 128, 0.08);\n                    overflow: hidden;\n                }\n                .pdf-page canvas {\n                    position: absolute;\n                    top: 0;\n                    left: 0;\n                    display: block;\n                    width: 100%;\n                    height: 100%;\n                }\n                /* PDF.js text layer: transparent text positioned over the canvas so\n                   screen readers can read page content. Spans are placed by\n                   pdfjsLib.renderTextLayer using --scale-factor for sizing. */\n                .textLayer {\n                    position: absolute;\n                    inset: 0;\n                    overflow: hidden;\n                    line-height: 1;\n                    -webkit-text-size-adjust: none;\n                    text-size-adjust: none;\n                    transform-origin: 0 0;\n                    z-index: 2;\n                }\n                .textLayer[data-main-rotation=\"90\"]  { transform: rotate(90deg)  translateY(-100%); }\n                .textLayer[data-main-rotation=\"180\"] { transform: rotate(180deg) translate(-100%, -100%); }\n                .textLayer[data-main-rotation=\"270\"] { transform: rotate(270deg) translateX(-100%); }\n                .textLayer span, .textLayer br {\n                    color: transparent;\n                    position: absolute;\n                    white-space: pre;\n                    transform-origin: 0% 0%;\n                }\n                /* Visually hidden but exposed to screen readers (display:none and\n                   visibility:hidden would remove it from the accessibility tree).\n                   user-select keeps the hidden text out of long-press selection so\n                   copied multi-page passages aren't polluted with page labels. */\n                .sr-only {\n                    position: absolute;\n                    width: 1px;\n                    height: 1px;\n                    margin: 0;\n                    overflow: hidden;\n                    clip: rect(0 0 0 0);\n                    clip-path: inset(50%);\n                    white-space: nowrap;\n                    -webkit-user-select: none;\n                    user-select: none;\n                }\n                /* Extra space so the Download FAB doesn't cover the last page.\n                   Updated at runtime via --bottom-inset CSS variable. */\n                #pdf-container::after {\n                    content: '';\n                    display: block;\n                    height: var(--bottom-inset);\n                }\n            </style>\n            <script src=\"https://cdn.jsdelivr.net/npm/pdfjs-dist@3.11.174/build/pdf.min.js\"></script>\n        </head>\n        <body>\n            <div id=\"pdf-container\"></div>\n            <script>\n                pdfjsLib.GlobalWorkerOptions.workerSrc =\n                    'https://cdn.jsdelivr.net/npm/pdfjs-dist@3.11.174/build/pdf.worker.min.js';\n                const PAGE_LABEL = " + JSONObject.quote(string) + ";\n                (async () => {\n                    const postToNative = (m) => { " + strConcat + "; };\n                    const reportError = (e) =>\n                        postToNative({ type: 'error', message: (e && e.message) || 'Unknown error' });\n                    try {\n                        const pdf = await pdfjsLib.getDocument('https://pdfproxy.local/document.pdf').promise;\n                        const container = document.getElementById('pdf-container');\n                        const containerWidth = container.clientWidth || window.innerWidth;\n\n                        // Zoom headroom: WebView's pinch-to-zoom scales raw canvas pixels,\n                        // so zooming past 1:1 makes content blurry. To mitigate this, we\n                        // render each page at (devicePixelRatio * ZOOM_HEADROOM) times the\n                        // CSS display size. The CSS `width: 100%` downscales the canvas to\n                        // fit the viewport at default zoom, and when the user pinch-zooms\n                        // they're zooming into the high-resolution buffer.\n                        //\n                        // Example: on a device with dpr=2.5 and ZOOM_HEADROOM=2, the canvas\n                        // has 5x the pixels of its CSS size, so content stays crisp up to\n                        // ~5x pinch-zoom. The trade-off is higher memory per page — which is\n                        // why at most MAX_RENDERED canvases are kept alive at once.\n                        const dpr = window.devicePixelRatio || 1;\n                        const ZOOM_HEADROOM = 2;\n                        // Window of ~current±3 pages. At ~24MB RGBA per page on a dpr=2.5\n                        // device, 7 pages is ~170MB — bounded and well under lmkd pressure.\n                        const MAX_RENDERED = 7;\n\n                        // pageNum -> canvas currently in the DOM\n                        const rendered = new Map();\n                        // pageNums with a render in flight (dedupes observer callbacks)\n                        const pending = new Set();\n                        // pageNums the IntersectionObserver currently reports as near-viewport\n                        const wanted = new Set();\n                        let firstPageSignaled = false;\n\n                        function clearPage(pageNum) {\n                            const canvas = rendered.get(pageNum);\n                            if (!canvas) return;\n                            // Zeroing width/height drops the backing pixel buffer immediately,\n                            // rather than waiting for GC after removal from the DOM.\n                            canvas.width = 0;\n                            canvas.height = 0;\n                            canvas.remove();\n                            rendered.delete(pageNum);\n                        }\n\n                        // Returns true if a page was evicted. Never evicts a page the render\n                        // observer still reports as near-viewport, so the cap can't remove\n                        // something the user is looking at.\n                        function evictFurthestFrom(pageNum) {\n                            let victim = -1;\n                            let maxDist = -1;\n                            for (const n of rendered.keys()) {\n                                if (wanted.has(n)) continue;\n                                const d = Math.abs(n - pageNum);\n                                if (d > maxDist) {\n                                    maxDist = d;\n                                    victim = n;\n                                }\n                            }\n                            if (victim > 0) {\n                                clearPage(victim);\n                                return true;\n                            }\n                            return false;\n                        }\n\n                        async function renderPage(pageNum, holder) {\n                            if (rendered.has(pageNum) || pending.has(pageNum)) return;\n                            pending.add(pageNum);\n                            try {\n                                while (rendered.size >= MAX_RENDERED && evictFurthestFrom(pageNum)) {}\n\n                                const page = await pdf.getPage(pageNum);\n                                try {\n                                    if (!wanted.has(pageNum)) {\n                                        // Scrolled away during getPage() — skip the ~30MB canvas\n                                        // allocation entirely. This is what keeps pending-render\n                                        // memory bounded during a fast fling.\n                                        return;\n                                    }\n                                    const unscaledViewport = page.getViewport({ scale: 1.0 });\n                                    const fitScale = containerWidth / unscaledViewport.width;\n                                    const renderScale = fitScale * dpr * ZOOM_HEADROOM;\n                                    const viewport = page.getViewport({ scale: renderScale });\n\n                                    const canvas = document.createElement('canvas');\n                                    canvas.setAttribute('aria-hidden', 'true');\n                                    canvas.width = viewport.width;\n                                    canvas.height = viewport.height;\n\n                                    try {\n                                        await page.render({\n                                            canvasContext: canvas.getContext('2d'),\n                                            viewport: viewport,\n                                        }).promise;\n                                    } catch (e) {\n                                        // Drop the backing pixel buffer on the failure path too,\n                                        // same as the scrolled-away case below.\n                                        canvas.width = 0;\n                                        canvas.height = 0;\n                                        throw e;\n                                    }\n\n                                    if (!wanted.has(pageNum)) {\n                                        // Scrolled away while rendering; discard the result.\n                                        canvas.width = 0;\n                                        canvas.height = 0;\n                                        return;\n                                    }\n\n                                    holder.appendChild(canvas);\n                                    rendered.set(pageNum, canvas);\n                                    while (rendered.size > MAX_RENDERED && evictFurthestFrom(pageNum)) {}\n\n                                    if (!firstPageSignaled) {\n                                        firstPageSignaled = true;\n                                        // Signal native layer after the first page renders so it\n                                        // can fade out the loading spinner\n                                        postToNative({ type: 'loaded', pageCount: pdf.numPages });\n                                    }\n                                } finally {\n                                    page.cleanup();\n                                }\n                            } finally {\n                                pending.delete(pageNum);\n                            }\n                        }\n\n                        function onRenderError(pageNum, e) {\n                            if (pageNum !== 1 || firstPageSignaled) {\n                                // Only a page-1 failure before anything has rendered is fatal.\n                                // Pages render concurrently on first load, so page 2+ can fail\n                                // before page 1 settles; don't let that replace the whole sheet\n                                // with the crash state and lose the user's scroll position.\n                                console.error('PDF page ' + pageNum + ' render failed', e);\n                            } else {\n                                reportError(e);\n                            }\n                        }\n\n                        // Render when a page is within ~3 pages of the viewport (2 viewport-\n                        // heights of lookahead each side). rootMargin is a static % so it's\n                        // measured against the layout viewport and unaffected by pinch-zoom.\n                        const renderObserver = new IntersectionObserver((entries) => {\n                            for (const entry of entries) {\n                                const pageNum = parseInt(entry.target.dataset.page, 10);\n                                if (entry.isIntersecting) {\n                                    wanted.add(pageNum);\n                                    renderPage(pageNum, entry.target)\n                                        .catch((e) => onRenderError(pageNum, e));\n                                } else {\n                                    wanted.delete(pageNum);\n                                }\n                            }\n                        }, { rootMargin: '200% 0px' });\n\n                        // Only free a page once it's well outside the render window, so a page\n                        // drifting across the render boundary isn't repeatedly torn down and\n                        // re-rendered. The MAX_RENDERED cap reclaims pages that sit in the\n                        // hysteresis band between the two thresholds when space is needed.\n                        const cleanupObserver = new IntersectionObserver((entries) => {\n                            for (const entry of entries) {\n                                if (!entry.isIntersecting) {\n                                    clearPage(parseInt(entry.target.dataset.page, 10));\n                                }\n                            }\n                        }, { rootMargin: '400% 0px' });\n\n                        // Create a correctly-sized placeholder per page so the scroll extent is\n                        // accurate without rendering any pixels. Each placeholder is observed as\n                        // soon as it's appended, so page 1 starts rendering while the rest are\n                        // still being measured.\n                        for (let pageNum = 1; pageNum <= pdf.numPages; pageNum++) {\n                            const page = await pdf.getPage(pageNum);\n                            const unscaledViewport = page.getViewport({ scale: 1.0 });\n                            const fitScale = containerWidth / unscaledViewport.width;\n\n                            const holder = document.createElement('div');\n                            holder.className = 'pdf-page';\n                            holder.dataset.page = String(pageNum);\n                            holder.style.height = Math.round(unscaledViewport.height * fitScale) + 'px';\n\n                            // Page boundaries are announced via a visually-hidden heading\n                            // rather than role=\"region\" + aria-label on the holder (the\n                            // pdf.js viewer pattern): TalkBack does not announce a web\n                            // container's label when swipe traversal enters it, so labeled\n                            // regions produce silent page boundaries on device. A hidden\n                            // heading is its own traversal stop, and also lets TalkBack\n                            // users jump between pages with heading-granularity navigation.\n                            // toLocaleString so digits match the device locale's numbering\n                            // system (Arabic-Indic, Bengali, ...) like natively formatted text.\n                            const localeNum = (n) =>\n                                n.toLocaleString(navigator.language, { useGrouping: false });\n                            const pageHeading = document.createElement('h2');\n                            pageHeading.className = 'sr-only';\n                            pageHeading.textContent = PAGE_LABEL\n                                .replace('{n}', localeNum(pageNum))\n                                .replace('{total}', localeNum(pdf.numPages));\n                            holder.appendChild(pageHeading);\n                            container.appendChild(holder);\n                            renderObserver.observe(holder);\n                            cleanupObserver.observe(holder);\n\n                            // Text layer for screen readers. Rendered eagerly for every\n                            // page and never evicted: text DOM is negligible next to the\n                            // ~24MB/page canvas buffers, and TalkBack needs the whole\n                            // document reachable regardless of which canvases are live.\n                            const textLayerDiv = document.createElement('div');\n                            textLayerDiv.className = 'textLayer';\n                            textLayerDiv.style.setProperty('--scale-factor', fitScale);\n                            holder.appendChild(textLayerDiv);\n                            const textViewport = page.getViewport({ scale: fitScale });\n                            page.getTextContent().then((textContent) =>\n                                pdfjsLib.renderTextLayer({\n                                    textContentSource: textContent,\n                                    container: textLayerDiv,\n                                    viewport: textViewport,\n                                }).promise.then(() => {\n                                    // Without an element-level role, Chromium's Android\n                                    // accessibility bridge collapses a container whose children\n                                    // are all static text into ONE focusable node spanning the\n                                    // whole page, so TalkBack reads the entire page as a single\n                                    // utterance. role=paragraph makes each pdf.js text item its\n                                    // own traversal stop with its own focus rectangle — per-line\n                                    // on most documents, per-word/fragment on producers that\n                                    // split lines across show-text operators. Whitespace-only\n                                    // items are skipped so they don't become silent stops.\n                                    textLayerDiv.querySelectorAll(':scope > span').forEach((s) => {\n                                        if (!s.textContent.trim()) return;\n                                        s.setAttribute('role', 'paragraph');\n                                    });\n                                }).catch((e) =>\n                                    console.error('PDF text layer page ' + pageNum, e))\n                            ).catch((e) =>\n                                console.error('PDF text content page ' + pageNum, e)\n                            ).finally(() => page.cleanup());\n                        }\n                    } catch (e) {\n                        reportError(e);\n                    }\n                })();\n            </script>\n        </body>\n        </html>\n    "), "text/html", "UTF-8", null);
                return gj7Var;
            case 1:
                Context context2 = (Context) this.G;
                nwb nwbVar2 = (nwb) this.F;
                nwb nwbVar3 = (nwb) this.H;
                nwb nwbVar4 = (nwb) this.I;
                ((r4a) obj).getClass();
                context2.getClass();
                nwbVar2.setValue(Boolean.valueOf(Build.VERSION.SDK_INT < 33 ? !((notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class)) == null || !notificationManager.areNotificationsEnabled()) : x44.x(context2, "android.permission.POST_NOTIFICATIONS") == 0));
                nwbVar3.setValue(Boolean.valueOf(x44.x(context2, "android.permission.ACCESS_COARSE_LOCATION") == 0));
                nwbVar4.setValue(Boolean.valueOf(x44.x(context2, "android.permission.READ_CALENDAR") == 0));
                return new le(22);
            case 2:
                dyc dycVar = (dyc) this.G;
                zy7 zy7Var = (zy7) this.H;
                zy7 zy7Var2 = (zy7) this.I;
                zy7 zy7Var3 = (zy7) this.F;
                haa haaVar = (haa) obj;
                haaVar.getClass();
                haa.a(haaVar, ((vxc) dycVar.g.getValue()).g || ((vxc) dycVar.i.getValue()).g || ((vxc) dycVar.h.getValue()).g, new ta4(-2203549, true, new kw(dycVar, zy7Var, zy7Var2, zy7Var3, 10)), 2);
                return iei.a;
            case 3:
                cae caeVar = (cae) this.G;
                y49 y49Var = (y49) this.H;
                float[] fArr = (float[]) this.I;
                List list = (List) this.F;
                long jLongValue = ((Long) obj).longValue();
                float f = caeVar.E == 0 ? 0.0f : (jLongValue - r6) / 1000.0f;
                caeVar.E = jLongValue;
                float fD0 = (wd6.d0((y49Var != null ? y49Var.a : 0.0f) / 2000.0f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f) - 0.1f) / 0.9f;
                if (fD0 < MTTypesetterKt.kLineSkipLimitMultiplier) {
                    fD0 = 0.0f;
                }
                float fPow = (float) Math.pow(fD0, 1.25d);
                for (int i = 0; i < 7; i++) {
                    float fExp = f <= MTTypesetterKt.kLineSkipLimitMultiplier ? 0.0f : 1.0f - ((float) Math.exp((xuj.c[i] * (-6.2831855f)) * f));
                    float f2 = fArr[i];
                    fArr[i] = sq6.k(fPow, f2, fExp, f2);
                    ((hsc) list.get(i)).i(fArr[i]);
                }
                return iei.a;
            case 4:
                vxc vxcVar = (vxc) this.G;
                bz7 bz7Var3 = (bz7) this.H;
                bz7 bz7Var4 = (bz7) this.I;
                bz7 bz7Var5 = (bz7) this.F;
                j0a j0aVar = (j0a) obj;
                j0aVar.getClass();
                eyh eyhVar = vxcVar.e;
                if (eyhVar != null) {
                    j0a.V(j0aVar, null, null, new ta4(1899046779, true, new nw7(eyhVar, 29, bz7Var4)), 3);
                }
                j0a.V(j0aVar, null, null, new ta4(124733718, true, new u3e(vxcVar, z ? 1 : 0, bz7Var5)), 3);
                if (bz7Var3 != null) {
                    bz7Var3.invoke(j0aVar);
                }
                return iei.a;
            case 5:
                nwb nwbVar5 = (nwb) this.F;
                bz7 bz7Var6 = (bz7) this.H;
                lo3 lo3Var = (lo3) this.G;
                bz7 bz7Var7 = (bz7) this.I;
                fcc fccVar = (fcc) obj;
                yjh yjhVar = (yjh) nwbVar5.getValue();
                if (yjhVar != null) {
                    String str = (String) bz7Var6.invoke(Integer.valueOf(yjhVar.b.g(fccVar.a)));
                    if (str != null) {
                        lo3Var.a(str, bz7Var7);
                    }
                }
                return iei.a;
            case 6:
                View view = (View) this.G;
                phg phgVar = (phg) this.H;
                Object obj2 = this.I;
                String str2 = (String) this.F;
                v4a v4aVar = (v4a) obj;
                v4aVar.getClass();
                view.setKeepScreenOn(true);
                gb9.D(phgVar.a, null, null, new mt4(phgVar, obj2, str2, (tp4) null, 27), 3);
                return new nhg(v4aVar, phgVar, obj2, view);
            case 7:
                zy7 zy7Var4 = (zy7) this.G;
                zy7 zy7Var5 = (zy7) this.H;
                sih sihVar = (sih) this.I;
                ykh ykhVar = (ykh) this.F;
                meh mehVar = (meh) obj;
                zy7Var4.a();
                if (zy7Var5 != null ? ((Boolean) zy7Var5.a()).booleanValue() : true) {
                    mehVar.close();
                }
                sihVar.E(ykhVar);
                return iei.a;
            default:
                o3f o3fVar = (o3f) this.G;
                Boolean bool = (Boolean) this.H;
                zy7 zy7Var6 = (zy7) this.I;
                nwb nwbVar6 = (nwb) this.F;
                ((r4a) obj).getClass();
                if (!((Boolean) nwbVar6.getValue()).booleanValue()) {
                    nwbVar6.setValue(Boolean.TRUE);
                    o3fVar.b.e(new WebViewEvents$WebViewErrorStateShown(o3fVar.a, bool.booleanValue()), WebViewEvents$WebViewErrorStateShown.Companion.serializer());
                    zy7Var6.a();
                }
                return new le(26);
        }
    }

    public /* synthetic */ wvc(Context context, nwb nwbVar, nwb nwbVar2, nwb nwbVar3) {
        this.E = 1;
        this.G = context;
        this.F = nwbVar;
        this.H = nwbVar2;
        this.I = nwbVar3;
    }

    public /* synthetic */ wvc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
    }
}
