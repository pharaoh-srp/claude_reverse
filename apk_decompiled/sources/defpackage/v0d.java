package defpackage;

import com.anthropic.claude.tool.custom.a;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutputTranscriptItemSpeaker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class v0d {
    public final hdc a;
    public final String b;
    public final lsc c;
    public final lsc d;
    public final kdg e;
    public volatile p5e f;
    public int g;
    public volatile boolean h;
    public final ih9 i;
    public final a j;

    public v0d(hdc hdcVar, String str) {
        hdcVar.getClass();
        this.a = hdcVar;
        this.b = str;
        this.c = mpk.P(r0d.a);
        this.d = mpk.P(Boolean.FALSE);
        this.e = new kdg();
        this.i = u00.c(new kac(27));
        this.j = new a(this);
    }

    public static final void a(v0d v0dVar, PhoneCallCompletedOutputTranscriptItemSpeaker phoneCallCompletedOutputTranscriptItemSpeaker, String str) {
        kwb kwbVarC;
        rcg rcgVarJ = ycg.j();
        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
            sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            return;
        }
        try {
            rcg rcgVarJ2 = kwbVarC.j();
            try {
                kdg kdgVar = v0dVar.e;
                int i = v0dVar.g;
                v0dVar.g = i + 1;
                kdgVar.add(new u0d(i, phoneCallCompletedOutputTranscriptItemSpeaker, str));
                kwbVarC.w().p();
            } finally {
                rcg.q(rcgVarJ2);
            }
        } finally {
        }
    }

    public static final void b(v0d v0dVar, c1d c1dVar) {
        kwb kwbVarC;
        v0dVar.f = null;
        if (((t0d) v0dVar.c.getValue()) instanceof s0d) {
            return;
        }
        rcg rcgVarJ = ycg.j();
        kwb kwbVar = rcgVarJ instanceof kwb ? (kwb) rcgVarJ : null;
        if (kwbVar == null || (kwbVarC = kwbVar.C(null, null)) == null) {
            sz6.j("Cannot create a mutable snapshot of an read-only snapshot");
            return;
        }
        try {
            rcg rcgVarJ2 = kwbVarC.j();
            try {
                v0dVar.c.setValue(new s0d(c1dVar));
                v0dVar.d.setValue(Boolean.FALSE);
                kwbVarC.w().p();
            } finally {
                rcg.q(rcgVarJ2);
            }
        } finally {
        }
    }

    public final void c() {
        if (this.f != null) {
            return;
        }
        this.h = false;
        sfa sfaVar = sfa.DEBUG;
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strConcat = "Opening monitor: ".concat(this.b);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "PhoneCallMonitor", strConcat);
                }
            }
        }
        jie jieVar = new jie();
        jieVar.g(this.b);
        kie kieVar = new kie(jieVar);
        gdc gdcVarB = this.a.b();
        lz1 lz1Var = uh6.F;
        gdcVarB.c(0L);
        gdcVarB.A = blj.c(v40.Q(30, zh6.SECONDS));
        this.f = new hdc(gdcVarB).c(kieVar, this.j);
    }
}
