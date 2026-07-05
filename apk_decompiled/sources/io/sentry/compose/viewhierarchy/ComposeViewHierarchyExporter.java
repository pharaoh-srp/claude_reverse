package io.sentry.compose.viewhierarchy;

import defpackage.av9;
import defpackage.jqb;
import defpackage.l9e;
import defpackage.mdj;
import defpackage.nai;
import defpackage.wwb;
import defpackage.z39;
import io.sentry.a1;
import io.sentry.compose.a;
import io.sentry.protocol.l0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lio/sentry/compose/viewhierarchy/ComposeViewHierarchyExporter;", "Lio/sentry/a1;", "logger", "<init>", "(Lio/sentry/a1;)V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final class ComposeViewHierarchyExporter {
    public final a1 a;
    public volatile a b;
    public final io.sentry.util.a c;

    public ComposeViewHierarchyExporter(a1 a1Var) {
        a1Var.getClass();
        this.a = a1Var;
        this.c = new io.sentry.util.a();
    }

    public static void a(a aVar, l0 l0Var, av9 av9Var) {
        if (av9Var.Y()) {
            l0 l0Var2 = new l0();
            Iterator it = av9Var.E().iterator();
            while (it.hasNext()) {
                String strA = aVar.a(((jqb) it.next()).a());
                if (strA != null) {
                    l0Var2.H = strA;
                }
            }
            l9e l9eVarO = nai.o((z39) av9Var.k0.H);
            l0Var2.K = Double.valueOf(l9eVarO.a);
            l0Var2.L = Double.valueOf(l9eVarO.b);
            l0Var2.J = Double.valueOf(l9eVarO.d - r3);
            l0Var2.I = Double.valueOf(l9eVarO.c - r2);
            String str = l0Var2.H;
            if (str == null) {
                str = "@Composable";
            }
            l0Var2.F = str;
            if (l0Var.O == null) {
                l0Var.O = new ArrayList();
            }
            List list = l0Var.O;
            list.getClass();
            list.add(l0Var2);
            wwb wwbVarL = av9Var.L();
            int i = wwbVarL.G;
            for (int i2 = 0; i2 < i; i2++) {
                a(aVar, l0Var2, (av9) wwbVarL.E[i2]);
            }
        }
    }
}
