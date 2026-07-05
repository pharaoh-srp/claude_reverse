package com.anthropic.claude.ui.components.snackbar;

import com.anthropic.claude.api.errors.ClaudeApiErrorException;
import com.anthropic.claude.api.result.ApiResult;
import defpackage.bj3;
import defpackage.gh2;
import defpackage.gsk;
import defpackage.lf0;
import defpackage.mf0;
import defpackage.mr9;
import defpackage.n30;
import defpackage.nf0;
import defpackage.nt6;
import defpackage.of0;
import defpackage.rt6;
import defpackage.sfa;
import defpackage.tt6;
import defpackage.yfa;
import defpackage.zfa;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(ApiResult apiResult, gh2 gh2Var) {
        apiResult.getClass();
        gh2Var.getClass();
        if (apiResult instanceof of0) {
            return;
        }
        if (!(apiResult instanceof nf0)) {
            mr9.b();
            return;
        }
        nf0 nf0Var = (nf0) apiResult;
        if (nf0Var instanceof lf0) {
            b(((lf0) apiResult).b(), gh2Var);
        } else if (nf0Var instanceof mf0) {
            c(((mf0) apiResult).a(), gh2Var);
        } else {
            mr9.b();
        }
    }

    public static void b(bj3 bj3Var, gh2 gh2Var) {
        bj3Var.getClass();
        gh2Var.getClass();
        gh2Var.r(new nt6(bj3Var));
        ClaudeApiErrorException claudeApiErrorException = new ClaudeApiErrorException(bj3Var, "API Error: ");
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String str = "API Error:  " + claudeApiErrorException + ": " + gsk.c(claudeApiErrorException);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "ApiResultExtensionsWithSnackbar", str);
            }
        }
    }

    public static void c(Throwable th, gh2 gh2Var) {
        th.getClass();
        gh2Var.getClass();
        if (th instanceof IOException) {
            gh2Var.r(rt6.a);
        } else {
            gh2Var.r(new tt6());
        }
        ApiException apiException = new ApiException(th);
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            zfa.a.getClass();
            String str = "API Exception:  " + th + ": " + gsk.c(apiException);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((n30) ((zfa) it.next())).b(sfa.ERROR, "ApiResultExtensionsWithSnackbar", str);
            }
        }
    }
}
