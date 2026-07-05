package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.health.platform.client.proto.g;
import androidx.media3.common.PlaybackException;
import androidx.work.impl.WorkDatabase;
import com.anthropic.claude.analytics.events.ChatEvents$ModelSelectorSheetSource;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroCompleted;
import com.anthropic.claude.analytics.events.DispatchEvents$StarterIntroDismissReason;
import com.anthropic.claude.bell.BellOverlayDestination;
import com.anthropic.claude.chat.bottomsheet.model.ModelSelectorBottomSheetDestination;
import com.anthropic.claude.code.remote.bottomsheet.CodeRemoteBottomSheetDestination;
import com.anthropic.claude.code.remote.c;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.configs.flags.ToolSearchModeConfig;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ToolSearchMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ik1 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    public /* synthetic */ ik1(mj1 mj1Var, Object obj, int i) {
        this.E = i;
        this.F = mj1Var;
        this.G = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r5v1, types: [p4j] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [mj1] */
    @Override // defpackage.zy7
    public final Object a() {
        String str;
        int i = this.E;
        int i2 = 10;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        z = false;
        z = false;
        Object obj = null;
        iei ieiVar = iei.a;
        Object obj2 = this.F;
        Object obj3 = this.G;
        switch (i) {
            case 0:
                fn1 fn1Var = (fn1) obj3;
                mj1 mj1Var = (mj1) obj2;
                if (fn1Var != null) {
                    ((tn1) fn1Var).g();
                }
                mj1Var.i.e(true);
                break;
            case 1:
                ?? r8 = (mj1) obj2;
                rwe rweVar = (rwe) obj3;
                p4j p4jVar = (p4j) r8.P.getValue();
                 = p4jVar instanceof o4j ? (o4j) p4jVar : 0;
                if ( != 0) {
                    r8.Z(, "accepted");
                }
                r8.O();
                r8.R.setValue(Boolean.TRUE);
                rweVar.E.m(new fv(5, new BellOverlayDestination[]{BellOverlayDestination.Settings.INSTANCE}), new a2g(13));
                break;
            case 2:
                ((bz7) obj3).invoke(Float.valueOf(((hsc) obj2).h()));
                break;
            case 3:
                mj1 mj1Var2 = (mj1) obj2;
                mj1Var2.P();
                ((pz7) obj3).invoke(Boolean.valueOf(mj1Var2.L), mj1Var2.M);
                break;
            case 4:
                v4g v4gVar = (v4g) obj3;
                l45 l45Var = (l45) obj2;
                if (((Boolean) v4gVar.c.invoke(b5g.G)).booleanValue()) {
                    gb9.D(l45Var, null, null, new my0(v4gVar, , 7), 3);
                }
                break;
            case 5:
                break;
            case 6:
                ((bz7) obj3).invoke(((o32) obj2).a);
                break;
            case 7:
                dw8 dw8Var = (dw8) obj2;
                ((pz7) obj3).invoke(dw8Var.a, dw8Var.b);
                break;
            case 8:
                bz7 bz7Var = (bz7) obj3;
                spf spfVar = (spf) obj2;
                if (bz7Var != null) {
                    bz7Var.invoke(((wlh) spfVar).a);
                }
                break;
            case 9:
                bgj bgjVar = (bgj) obj3;
                WorkDatabase workDatabase = bgjVar.c;
                workDatabase.getClass();
                workDatabase.o(new dg8(28, new fd(bgjVar, i2, (UUID) obj2)));
                b7f.b(bgjVar.b, workDatabase, bgjVar.e);
                break;
            case 10:
                bz7 bz7Var2 = (bz7) obj3;
                String strM732getValueOP4DWQA = ((ToolSearchModeConfig) obj2).m732getValueOP4DWQA();
                bz7Var2.invoke(strM732getValueOP4DWQA != null ? ToolSearchMode.m1150boximpl(strM732getValueOP4DWQA) : null);
                break;
            case 11:
                ((eli) obj3).a(((u56) obj2).c);
                break;
            case 12:
                pt2 pt2Var = (pt2) obj2;
                if (((AtomicBoolean) obj3).compareAndSet(false, true)) {
                    pt2Var.j.decrementAndGet();
                }
                break;
            case 13:
                f03 f03Var = (f03) obj3;
                cpk.e(f03Var.n);
                f03Var.Q(null);
                f03Var.p = null;
                skd skdVarQ0 = ((t53) obj2).Q0();
                if (skdVarQ0 == null || (r9 = skdVarQ0.a) == null) {
                }
                break;
            case 14:
                String str2 = (String) obj2;
                ListIterator listIterator = ((t53) obj3).X0.listIterator();
                while (true) {
                    c8a c8aVar = (c8a) listIterator;
                    if (c8aVar.hasNext()) {
                        Object next = c8aVar.next();
                        if (MessageId.m1054equalsimpl0(((whd) next).c(), str2)) {
                            obj = next;
                        }
                    }
                }
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((t53) obj3).g0.n(ChatEvents$ModelSelectorSheetSource.CHAT_INPUT);
                ((t4g) obj2).d(ModelSelectorBottomSheetDestination.SelectModel.INSTANCE);
                break;
            case 16:
                t53 t53Var = (t53) obj3;
                zy7 zy7Var = (zy7) obj2;
                w1i w1iVar = (w1i) t53Var.i2.getValue();
                if (w1iVar != null) {
                    t53Var.h2.setValue(Boolean.TRUE);
                    gb9.D(t53Var.a, null, null, new s53(t53Var, w1iVar, , z ? 1 : 0), 3);
                }
                zy7Var.a();
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((bz7) obj3).invoke((mc3) obj2);
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                v77 v77Var = (v77) obj3;
                nm3 nm3Var = (nm3) obj2;
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj4)).getClass();
                        arrayList.add(obj4);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str3 = "retry after " + ((PlaybackException) nm3Var.c.getValue());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfa.DEBUG, "ClaudeVideoPlayer", str3);
                        }
                    }
                }
                v77Var.w();
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((t4g) obj3).d(new CodeRemoteBottomSheetDestination.ToolCallDetail((rvh) obj2));
                break;
            case 21:
                ((bz7) obj3).invoke(((CodeRemoteBottomSheetDestination.AttachmentText) ((CodeRemoteBottomSheetDestination) obj2)).a);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ((t4g) obj3).a();
                ((zy7) obj2).a();
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                bx1 bx1Var = (bx1) obj2;
                p0a p0aVarH = ((x0a) obj3).h();
                q0a q0aVar = (q0a) w44.V0(p0aVarH.k);
                if ((q0aVar != null ? q0aVar.a : 0) >= p0aVarH.n - 3 && ((Boolean) bx1Var.k.getValue()).booleanValue() && !bx1Var.b()) {
                    z = true;
                }
                break;
            case 24:
                c cVar = (c) obj2;
                p0a p0aVarH2 = ((x0a) obj3).h();
                q0a q0aVar2 = (q0a) w44.V0(p0aVarH2.k);
                int i3 = q0aVar2 != null ? q0aVar2.a : -1;
                if (i3 >= 0 && i3 >= p0aVarH2.n - 5) {
                    htf htfVarA0 = cVar.a0();
                    if (htfVarA0.a != null && !htfVarA0.c && htfVarA0.d < 10) {
                        z2 = true;
                    }
                }
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                c cVar2 = (c) obj3;
                qi3 qi3Var = (qi3) obj2;
                lsc lscVar = cVar2.T;
                if (!((Boolean) lscVar.getValue()).booleanValue()) {
                    qi3Var.e(new DispatchEvents$StarterIntroCompleted(DispatchEvents$StarterIntroDismissReason.GET_STARTED), DispatchEvents$StarterIntroCompleted.Companion.serializer());
                    vb7.B(cVar2.i.a, "cowork_starter_seen", true);
                    lscVar.setValue(Boolean.TRUE);
                }
                break;
            case 26:
                ((bz7) obj3).invoke((m29) obj2);
                break;
            case 27:
                ((bz7) obj3).invoke(((b68) obj2).a);
                break;
            case 28:
                i iVar = (i) obj2;
                ((Context) obj3).startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://github.com/apps/claude/installations/new")));
                iVar.k1.setValue(Boolean.FALSE);
                iVar.j1();
                break;
            default:
                t4g t4gVar = (t4g) obj2;
                dc1 dc1Var = (dc1) w44.N0((List) obj3);
                if (dc1Var != null && (str = dc1Var.a) != null) {
                    t4gVar.d(new CodeRemoteBottomSheetDestination.WorkflowDetail(str));
                }
                break;
        }
        return ieiVar;
    }

    public /* synthetic */ ik1(Object obj, int i, Object obj2) {
        this.E = i;
        this.G = obj;
        this.F = obj2;
    }
}
