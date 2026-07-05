package io.sentry.compose.gestures;

import android.view.View;
import androidx.compose.ui.node.Owner;
import defpackage.av9;
import defpackage.cpc;
import defpackage.csg;
import defpackage.dkf;
import defpackage.iqb;
import defpackage.jqb;
import defpackage.mdj;
import defpackage.sjf;
import defpackage.x44;
import defpackage.z39;
import io.sentry.a1;
import io.sentry.internal.gestures.a;
import io.sentry.internal.gestures.b;
import io.sentry.internal.gestures.c;
import io.sentry.r5;
import io.sentry.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/compose/gestures/ComposeGestureTargetLocator;", "Lio/sentry/internal/gestures/a;", "Lio/sentry/a1;", "logger", "<init>", "(Lio/sentry/a1;)V", "sentry-compose_release"}, k = 1, mv = {1, 9, 0}, xi = mdj.f)
public final class ComposeGestureTargetLocator implements a {
    public final a1 a;
    public volatile io.sentry.compose.a b;
    public final io.sentry.util.a c;

    public ComposeGestureTargetLocator(a1 a1Var) {
        a1Var.getClass();
        this.a = a1Var;
        this.c = new io.sentry.util.a();
        r5.d().b("maven:io.sentry:sentry-compose", "8.43.1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.internal.gestures.a
    public final c a(View view, float f, float f2, b bVar) throws Exception {
        String strA;
        String str;
        bVar.getClass();
        if (view instanceof Owner) {
            if (this.b == null) {
                v vVarA = this.c.a();
                try {
                    if (this.b == null) {
                        this.b = new io.sentry.compose.a(this.a);
                    }
                    csg.o(vVarA, null);
                } finally {
                }
            }
            av9 root = ((Owner) view).getRoot();
            LinkedList linkedList = new LinkedList();
            linkedList.add(new cpc(root, null));
            String str2 = null;
            while (!linkedList.isEmpty()) {
                cpc cpcVar = (cpc) linkedList.poll();
                if (cpcVar != null) {
                    av9 av9Var = (av9) cpcVar.E;
                    String str3 = (String) cpcVar.F;
                    if (av9Var.Y()) {
                        if (io.sentry.config.a.a((z39) av9Var.k0.H, (z39) root.k0.H).a((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L))) {
                            io.sentry.compose.a aVar = this.b;
                            aVar.getClass();
                            List listE = av9Var.E();
                            int size = listE.size();
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    strA = null;
                                    break;
                                }
                                strA = aVar.a(((jqb) listE.get(i2)).a());
                                if (strA != null) {
                                    break;
                                }
                                i2++;
                            }
                            String str4 = strA == null ? str3 : strA;
                            if (str4 != null) {
                                List listE2 = av9Var.E();
                                int size2 = listE2.size();
                                while (i < size2) {
                                    jqb jqbVar = (jqb) listE2.get(i);
                                    if (jqbVar.a() instanceof sjf) {
                                        iqb iqbVarA = jqbVar.a();
                                        iqbVarA.getClass();
                                        Iterator it = ((sjf) iqbVarA).getSemanticsConfiguration().iterator();
                                        while (it.hasNext()) {
                                            String str5 = ((dkf) ((Map.Entry) it.next()).getKey()).a;
                                            if (bVar == b.SCROLLABLE && "ScrollBy".equals(str5)) {
                                                return new c(null, null, null, str4, "jetpack_compose");
                                            }
                                            if (bVar == b.CLICKABLE && "OnClick".equals(str5)) {
                                                str2 = str4;
                                            }
                                        }
                                    } else {
                                        String name = jqbVar.a().getClass().getName();
                                        if (bVar == b.CLICKABLE && ("androidx.compose.foundation.ClickableElement".equals(name) || "androidx.compose.foundation.CombinedClickableElement".equals(name))) {
                                            str2 = str4;
                                            str = str2;
                                            i++;
                                            str4 = str;
                                        } else if (bVar == b.SCROLLABLE && ("androidx.compose.foundation.ScrollingLayoutElement".equals(name) || "androidx.compose.foundation.ScrollingContainerElement".equals(name))) {
                                            return new c(null, null, null, str4, "jetpack_compose");
                                        }
                                    }
                                    str = str4;
                                    i++;
                                    str4 = str;
                                }
                            }
                            String str6 = str4;
                            List listG = av9Var.L().g();
                            ArrayList arrayList = new ArrayList(x44.y(listG, 10));
                            Iterator it2 = listG.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(new cpc((av9) it2.next(), str6));
                            }
                            linkedList.addAll(arrayList);
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (str2 != null) {
                return new c(null, null, null, str2, "jetpack_compose");
            }
        }
        return null;
    }
}
