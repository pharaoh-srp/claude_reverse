package defpackage;

import com.anthropic.claude.code.remote.NewCodeSessionPrefill;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r3c extends m08 implements zy7 {
    public final /* synthetic */ u3c E;
    public final /* synthetic */ boolean F;
    public final /* synthetic */ String G;
    public final /* synthetic */ bz7 H;
    public final /* synthetic */ r4g I;
    public final /* synthetic */ nwb J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3c(u3c u3cVar, boolean z, String str, bz7 bz7Var, r4g r4gVar, nwb nwbVar) {
        super(0, gb9.class, "submit", "NewSessionSheet_zMp7uKE$submit(Lcom/anthropic/claude/code/remote/NewSessionSheetState;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/anthropic/claude/design/sheet/SheetDismissHelper;Landroidx/compose/runtime/MutableState;)V", 0);
        this.E = u3cVar;
        this.F = z;
        this.G = str;
        this.H = bz7Var;
        this.I = r4gVar;
        this.J = nwbVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        String str;
        u3c u3cVar = this.E;
        lsc lscVar = u3cVar.i;
        yih yihVar = u3cVar.a;
        if ((!bsg.I0(yihVar.d().G) || u3cVar.b()) && !u3cVar.a()) {
            nwb nwbVar = this.J;
            if (!((Boolean) nwbVar.getValue()).booleanValue()) {
                boolean z = this.F;
                String str2 = this.G;
                if (!z || str2 != null) {
                    nwbVar.setValue(Boolean.TRUE);
                    String string = yihVar.d().G.toString();
                    if (bsg.I0(string)) {
                        string = null;
                    }
                    int i = s3c.a[u3cVar.c().ordinal()];
                    if (i == 1) {
                        str = "plan";
                    } else if (i == 2) {
                        str = null;
                    } else {
                        if (i != 3) {
                            wg6.i();
                            return null;
                        }
                        str = "auto";
                    }
                    String str3 = z ? null : str;
                    boolean z2 = (z || u3cVar.c() != PermissionMode.Auto || ((Boolean) lscVar.getValue()).booleanValue()) ? false : true;
                    boolean z3 = !z && ((Boolean) lscVar.getValue()).booleanValue();
                    kdg kdgVar = u3cVar.m;
                    ArrayList arrayList = new ArrayList();
                    ListIterator listIterator = kdgVar.listIterator();
                    while (true) {
                        c8a c8aVar = (c8a) listIterator;
                        if (!c8aVar.hasNext()) {
                            break;
                        }
                        Object next = c8aVar.next();
                        if (((o32) next).a() instanceof j32) {
                            arrayList.add(next);
                        }
                    }
                    this.H.invoke(new NewCodeSessionPrefill(string, str3, null, null, null, null, null, false, true, arrayList, z ? lm6.E : w44.p1(u3cVar.j), str2, z2, z3, 236, null));
                    this.I.a();
                }
            }
        }
        return iei.a;
    }
}
