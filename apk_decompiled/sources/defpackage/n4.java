package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import com.anthropic.claude.analytics.events.CodeEvents$SessionListOpened;
import com.anthropic.claude.artifact.model.ArtifactMetadata;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.d;
import com.anthropic.claude.sessions.types.SessionResource;
import com.anthropic.claude.types.strings.SessionId;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class n4 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;

    public n4(AtomicBoolean atomicBoolean, xmh xmhVar, Context context, dae daeVar) {
        this.E = 4;
        this.F = atomicBoolean;
        this.G = context;
        this.H = daeVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        int i2 = 0;
        iei ieiVar = iei.a;
        Object obj = this.H;
        Object obj2 = this.G;
        Object obj3 = this.F;
        switch (i) {
            case 0:
                return new q4((r4) obj, (gfa) obj3, (zp3) obj2);
            case 1:
                ((bz7) obj3).invoke((ArtifactMetadata) obj2);
                ((zy7) obj).a();
                return ieiVar;
            case 2:
                iqb iqbVar = e93.a;
                ((nwb) obj2).setValue(Boolean.TRUE);
                ((m83) obj3).o.invoke(new u83(2, (nwb) obj));
                return ieiVar;
            case 3:
                c cVar = (c) obj3;
                SessionResource sessionResource = (SessionResource) obj2;
                sessionResource.getClass();
                List list = (List) cVar.G.getValue();
                we2 we2Var = we2.a;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                    } else if (!SessionId.m1117equalsimpl0(((SessionResource) it.next()).m875getIdOcx55TE(), sessionResource.m875getIdOcx55TE())) {
                        i2++;
                    }
                }
                Integer numValueOf = i2 >= 0 ? Integer.valueOf(i2) : null;
                Integer numValueOf2 = Integer.valueOf(list.size());
                we2.c = sessionResource.m875getIdOcx55TE();
                we2.d = Long.valueOf(System.nanoTime());
                we2.e = sessionResource;
                we2.f = numValueOf;
                we2.g = numValueOf2;
                if (((Boolean) cVar.l.l.getValue()).booleanValue()) {
                    cVar.d.v(sessionResource.m875getIdOcx55TE());
                }
                if (cVar.q.getEmitsCodeTabTelemetry()) {
                    cVar.m.e(new CodeEvents$SessionListOpened(cVar.n.a().e().m116getUuidXjkXN6I(), sessionResource.m875getIdOcx55TE(), d.c(sessionResource, (c69) cVar.C.getValue()).a(), ((srf) cVar.B.getValue()).a()), CodeEvents$SessionListOpened.Companion.serializer());
                }
                ((bz7) obj).invoke(sessionResource);
                return ieiVar;
            default:
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    Context context = (Context) obj2;
                    try {
                        Object obj4 = ((dae) obj).E;
                        if (obj4 == null) {
                            x44.o0("connection");
                            throw null;
                        }
                        context.unbindService((ServiceConnection) obj4);
                    } catch (Throwable unused) {
                    }
                }
                return ieiVar;
        }
    }

    public /* synthetic */ n4(Object obj, Object obj2, Object obj3, int i) {
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    public n4(r4 r4Var, gfa gfaVar, zp3 zp3Var) {
        this.E = 0;
        this.H = r4Var;
        this.F = gfaVar;
        this.G = zp3Var;
    }
}
