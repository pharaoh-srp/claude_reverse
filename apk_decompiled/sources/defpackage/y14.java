package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.R;
import com.anthropic.claude.code.remote.i;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.conway.f;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y14 extends m08 implements zy7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y14(i iVar, int i) {
        super(0, 0, i.class, iVar, "dismissCoworkHelplineSheet", "dismissCoworkHelplineSheet()V");
        this.E = i;
        switch (i) {
            case 3:
                super(0, 0, i.class, iVar, "acceptAutoModeOptIn", "acceptAutoModeOptIn()V");
                break;
            case 4:
                super(0, 0, i.class, iVar, "dismissAutoModeOptIn", "dismissAutoModeOptIn()V");
                break;
            case 5:
                super(0, 0, i.class, iVar, "acknowledgeAutoDefaultNotice", "acknowledgeAutoDefaultNotice()V");
                break;
            case 6:
            case 7:
            case 8:
            default:
                break;
            case 9:
                super(0, 0, i.class, iVar, "onRumViewStarted", "onRumViewStarted()V");
                break;
        }
    }

    @Override // defpackage.zy7
    public final Object a() throws IOException {
        int i = this.E;
        int i2 = 2;
        int i3 = 3;
        tp4 tp4Var = null;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return Long.valueOf(((mn5) this.receiver).a());
            case 1:
                n9g n9gVar = (n9g) this.receiver;
                n9gVar.c.setValue((b79) n9gVar.d.getValue());
                return ieiVar;
            case 2:
                ((i) this.receiver).N0.setValue(null);
                return ieiVar;
            case 3:
                i iVar = (i) this.receiver;
                a aVar = iVar.k;
                aVar.h.setValue(Boolean.TRUE);
                vb7.B(aVar.a, "auto_mode_opted_in", true);
                iVar.E1.setValue(Boolean.FALSE);
                if (x44.r(iVar.n0(), n71.b)) {
                    iVar.D1(PermissionMode.Auto);
                } else {
                    n2g n2gVar = iVar.g1;
                    String string = iVar.o.getString(R.string.ccr_permission_mode_auto_unavailable_model);
                    string.getClass();
                    n2gVar.f(string);
                }
                return ieiVar;
            case 4:
                ((i) this.receiver).E1.setValue(Boolean.FALSE);
                return ieiVar;
            case 5:
                i iVar2 = (i) this.receiver;
                a aVar2 = iVar2.k;
                aVar2.i.setValue(Boolean.TRUE);
                vb7.B(aVar2.a, "auto_default_notice_seen", true);
                iVar2.D1.setValue(Boolean.FALSE);
                return ieiVar;
            case 6:
                ((j8i) this.receiver).l();
                return ieiVar;
            case 7:
                ((j8i) this.receiver).j();
                return ieiVar;
            case 8:
                j8i j8iVar = (j8i) this.receiver;
                gb9.D(j8iVar.k, null, null, new k7h(j8iVar, tp4Var, i2), 3);
                return ieiVar;
            case 9:
                i iVar3 = (i) this.receiver;
                iVar3.X = true;
                if (iVar3.W) {
                    iVar3.W = false;
                    List list = xah.a;
                    xah.c("composer_enabled");
                }
                if (iVar3.O) {
                    iVar3.O = false;
                    List list2 = xah.a;
                    xah.c("first_content");
                    xah.b(vba.CACHE);
                }
                return ieiVar;
            case 10:
                ((i) this.receiver).d0();
                return ieiVar;
            case 11:
                uj4 uj4Var = (uj4) this.receiver;
                gb9.D(uj4Var.a, null, null, new mj4(uj4Var, tp4Var, i3), 3);
                return ieiVar;
            case 12:
                uj4 uj4Var2 = (uj4) this.receiver;
                gb9.D(uj4Var2.a, null, null, new mj4(uj4Var2, tp4Var, i2), 3);
                return ieiVar;
            case 13:
                ((f) this.receiver).C.m(null);
                return ieiVar;
            case 14:
                ((p05) this.receiver).V(null);
                return ieiVar;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((p05) this.receiver).V(null);
                return ieiVar;
            case 16:
                ((p05) this.receiver).W(null);
                return ieiVar;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((p05) this.receiver).W(null);
                return ieiVar;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ((f) this.receiver).v0();
                return ieiVar;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ((f) this.receiver).r.r(new pt6(R.string.conway_search_scroll_miss));
                return ieiVar;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((f) this.receiver).v0();
                return ieiVar;
            case 21:
                ((f) this.receiver).r.r(new pt6(R.string.conway_search_scroll_miss));
                return ieiVar;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                f fVar = (f) this.receiver;
                fkg fkgVar = fVar.O0;
                if (fkgVar == null || !fkgVar.c()) {
                    fVar.O0 = gb9.D(fVar.a, null, null, new ox4(fVar, tp4Var, 4), 3);
                }
                return ieiVar;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                ((f) this.receiver).s.setValue(null);
                return ieiVar;
            case 24:
                f fVar2 = (f) this.receiver;
                hsf hsfVar = (hsf) fVar2.y.getValue();
                if (hsfVar != null) {
                    gb9.D(fVar2.a, null, null, new hy4(fVar2, hsfVar.a, null), 3);
                } else {
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
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((n30) ((zfa) it.next())).b(sfa.DEBUG, "Conway", "refreshClients: no active session");
                            }
                        }
                    }
                }
                return ieiVar;
            case BuildConfig.VERSION_CODE /* 25 */:
                ((f) this.receiver).B0();
                return ieiVar;
            case 26:
                ((l4h) this.receiver).a();
                return ieiVar;
            case 27:
                ((q2d) this.receiver).a();
                return ieiVar;
            case 28:
                return ((beh) this.receiver).d0();
            default:
                ((jx5) this.receiver).O(nx5.a);
                return ieiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y14(j8i j8iVar, int i) {
        super(0, 0, j8i.class, j8iVar, "resetEnrollmentState", "resetEnrollmentState()V");
        this.E = i;
        switch (i) {
            case 7:
                super(0, 0, j8i.class, j8iVar, "prepareForRelogin", "prepareForRelogin()V");
                break;
            case 8:
                super(0, 0, j8i.class, j8iVar, "onReloginSucceeded", "onReloginSucceeded()V");
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y14(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }
}
