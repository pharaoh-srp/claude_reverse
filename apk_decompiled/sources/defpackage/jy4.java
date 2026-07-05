package defpackage;

import android.content.Context;
import com.anthropic.claude.R;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.conway.protocol.ChatPart;
import com.anthropic.claude.conway.protocol.UploadResult;
import com.anthropic.claude.conway.protocol.b0;
import com.anthropic.claude.types.strings.ForkId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jy4 extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f G;
    public final /* synthetic */ b0 H;
    public final /* synthetic */ String I;
    public final /* synthetic */ List J;
    public final /* synthetic */ long K;
    public final /* synthetic */ ArrayList L;
    public final /* synthetic */ Set M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jy4(f fVar, b0 b0Var, String str, List list, long j, ArrayList arrayList, Set set, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = fVar;
        this.H = b0Var;
        this.I = str;
        this.J = list;
        this.K = j;
        this.L = arrayList;
        this.M = set;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        jy4 jy4Var = new jy4(this.G, this.H, this.I, this.J, this.K, this.L, this.M, tp4Var);
        jy4Var.F = obj;
        return jy4Var;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((jy4) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        l45 l45Var = (l45) this.F;
        m45 m45Var = m45.E;
        int i = this.E;
        try {
            if (i == 0) {
                sf5.h0(obj);
                ArrayList<cpc> arrayList = this.L;
                String str = this.I;
                d8a d8aVarE = x44.E();
                ih9 ih9Var = ex4.a;
                d8aVarE.add(new ChatPart.Hint("<system>User sent a message from the claude-android client. If you want to respond to them, call standard_user_output with your response. Use plain html by default, and layer in tasteful formatting as necessary to show emphasis, diagrams, etc.</system>"));
                for (cpc cpcVar : arrayList) {
                    ckg ckgVar = (ckg) cpcVar.E;
                    UploadResult uploadResult = (UploadResult) cpcVar.F;
                    cx4 cx4Var = ckgVar.a;
                    d8aVarE.add(new ChatPart.Attachment(cx4Var.a, rsk.h(cx4Var, uploadResult)));
                }
                if (str.length() > 0) {
                    d8aVarE.add(new ChatPart.UserText(str));
                }
                d8a d8aVarV = x44.v(d8aVarE);
                ForkId forkIdM1021boximpl = ForkId.m1021boximpl(((dw4) this.G.I.getValue()).b);
                if (ForkId.m1026isMainimpl(forkIdM1021boximpl.m1028unboximpl())) {
                    forkIdM1021boximpl = null;
                }
                String strM1028unboximpl = forkIdM1021boximpl != null ? forkIdM1021boximpl.m1028unboximpl() : null;
                b0 b0Var = this.H;
                boolean z = this.I.length() > 0;
                this.F = l45Var;
                this.E = 1;
                if (b0Var.p(d8aVarV, z, strM1028unboximpl, this) == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
            }
            fd9.S(l45Var);
            amg amgVar = this.G.n0;
            Iterable iterable = (Iterable) amgVar.getValue();
            Set set = this.M;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iterable) {
                if (!set.contains(((ckg) obj2).c)) {
                    arrayList2.add(obj2);
                }
            }
            amgVar.n(null, arrayList2);
            if (this.G.E0 == sfb.F) {
                this.G.E0 = sfb.G;
            }
            this.G.C0(false);
        } catch (CancellationException e) {
            this.G.C0.removeAll(this.J);
            this.G.C0(false);
            throw e;
        } catch (Exception e2) {
            sfa sfaVar = sfa.ERROR;
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList3.add(obj3);
                }
                if (!arrayList3.isEmpty()) {
                    String strQ = sq6.q(zfa.a, e2, "send failed: ");
                    Iterator it = arrayList3.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfaVar, strE, strQ);
                    }
                }
            }
            this.G.C0.removeAll(this.J);
            this.G.E0 = sfb.E;
            f fVar = this.G;
            ArrayList arrayList4 = fVar.y0;
            Context context = fVar.b;
            String message = e2.getMessage();
            if (message == null) {
                message = "";
            }
            String string = context.getString(R.string.conway_error_send_failed, message);
            string.getClass();
            arrayList4.add(new mpg(string, this.K));
            this.G.C0(false);
        }
        return iei.a;
    }
}
