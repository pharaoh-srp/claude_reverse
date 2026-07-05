package defpackage;

import android.content.Context;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.account.RavenType;
import com.anthropic.claude.conway.send.OutboxItem;
import com.anthropic.claude.sessions.types.GetShareStatusResponse;
import com.anthropic.claude.sessions.types.ShareRecord;
import com.anthropic.claude.sessions.types.ShareStatus;
import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g81 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public g81(int i) {
        switch (i) {
            case 3:
                this.a = new zve();
                this.b = new zve();
                this.c = new zve();
                this.d = new zve();
                this.e = new y(MTTypesetterKt.kLineSkipLimitMultiplier);
                this.f = new y(MTTypesetterKt.kLineSkipLimitMultiplier);
                this.g = new y(MTTypesetterKt.kLineSkipLimitMultiplier);
                this.h = new y(MTTypesetterKt.kLineSkipLimitMultiplier);
                int i2 = 0;
                this.i = new hj6(i2);
                this.j = new hj6(i2);
                this.k = new hj6(i2);
                this.l = new hj6(i2);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0096 -> B:47:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00b5 -> B:47:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x011d -> B:47:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0124 -> B:47:0x0120). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.g81 r21, defpackage.vp4 r22) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g81.a(g81, vp4):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [lm6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList] */
    public static final void b(g81 g81Var, String str) {
        ?? arrayList;
        List<ShareRecord> shares;
        GetShareStatusResponse getShareStatusResponseF = g81Var.f();
        if (getShareStatusResponseF == null || (shares = getShareStatusResponseF.getShares()) == null) {
            arrayList = lm6.E;
        } else {
            List<ShareRecord> list = shares;
            arrayList = new ArrayList(x44.y(list, 10));
            for (ShareRecord shareRecordCopy$default : list) {
                if (x44.r(shareRecordCopy$default.getShare_id(), str)) {
                    shareRecordCopy$default = ShareRecord.copy$default(shareRecordCopy$default, null, ShareStatus.REVOKED, null, null, 13, null);
                }
                arrayList.add(shareRecordCopy$default);
            }
        }
        GetShareStatusResponse getShareStatusResponseF2 = g81Var.f();
        ((lsc) g81Var.h).setValue(new GetShareStatusResponse(arrayList, getShareStatusResponseF2 != null ? getShareStatusResponseF2.getSharing_settings() : null));
    }

    public h81 c() {
        return new h81((Integer) this.a, (String) this.b, (String) this.c, (String) this.d, (String) this.e, (String) this.f, (String) this.g, (String) this.h, (String) this.i, (String) this.j, (String) this.k, (String) this.l);
    }

    public f0g d() {
        f0g f0gVar = new f0g();
        f0gVar.a = (rtk) this.a;
        f0gVar.b = (rtk) this.b;
        f0gVar.c = (rtk) this.c;
        f0gVar.d = (rtk) this.d;
        f0gVar.e = (s35) this.e;
        f0gVar.f = (s35) this.f;
        f0gVar.g = (s35) this.g;
        f0gVar.h = (s35) this.h;
        f0gVar.i = (hj6) this.i;
        f0gVar.j = (hj6) this.j;
        f0gVar.k = (hj6) this.k;
        f0gVar.l = (hj6) this.l;
        return f0gVar;
    }

    public void e() {
        if (((qo0) this.k).isEmpty()) {
            return;
        }
        fkg fkgVar = (fkg) this.l;
        if (fkgVar == null || !fkgVar.c()) {
            this.l = gb9.D((l45) this.a, null, null, new cj(this, null, 16), 3);
        }
    }

    public GetShareStatusResponse f() {
        return (GetShareStatusResponse) ((lsc) this.h).getValue();
    }

    public String g() {
        SessionId sessionId = (SessionId) ((p14) this.f).a();
        String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
        if (strM1120unboximpl != null) {
            return ij0.C(((ze0) this.d).a(), "/code/", strM1120unboximpl);
        }
        return null;
    }

    public boolean h() {
        RavenType raven_type = ((koi) this.c).e().getRaven_type();
        return raven_type == RavenType.TEAM || raven_type == RavenType.ENTERPRISE;
    }

    public String i(bj3 bj3Var) {
        l1g l1gVar;
        Object next;
        Integer numValueOf = Integer.valueOf(R.string.ccr_share_error_permission_denied);
        Integer e = bj3Var.getE();
        if (e == null || e.intValue() != 403) {
            Integer e2 = bj3Var.getE();
            if (e2 == null || e2.intValue() != 404) {
                numValueOf = null;
            }
        } else if (hvk.f(bj3Var) != null) {
            numValueOf = Integer.valueOf(R.string.ccr_share_error_verify_identity);
        } else {
            Integer e3 = bj3Var.getE();
            if (e3 != null && e3.intValue() == 403) {
                String strF = bj3Var.getG();
                l1g.F.getClass();
                Iterator<E> it = l1g.H.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((l1g) next).E.equals(strF)) {
                        break;
                    }
                }
                l1gVar = (l1g) next;
            } else {
                l1gVar = null;
            }
            int i = l1gVar == null ? -1 : xtf.a[l1gVar.ordinal()];
            if (i != -1) {
                if (i == 1) {
                    numValueOf = Integer.valueOf(R.string.ccr_share_error_org_disabled);
                } else if (i == 2) {
                    numValueOf = Integer.valueOf(R.string.ccr_share_error_org_check_unavailable);
                } else if (i == 3) {
                    numValueOf = Integer.valueOf(R.string.ccr_share_error_zdr_restricted);
                } else if (i != 4) {
                    wg6.i();
                    return null;
                }
            }
        }
        if (numValueOf != null) {
            String string = ((Context) this.e).getString(numValueOf.intValue());
            if (string != null) {
                return string;
            }
        }
        String d = bj3Var.getD();
        return d == null ? bj3Var.toString() : d;
    }

    public void j() {
        String strD;
        lx4 lx4Var = (lx4) this.d;
        qo0 qo0Var = (qo0) this.k;
        if (qo0Var.isEmpty()) {
            strD = null;
        } else {
            strD = ((bg9) this.e).d(w44.p1(qo0Var), d4c.t(OutboxItem.Companion.serializer()));
        }
        lx4Var.invoke(strD);
    }

    public void k(String str) {
        this.l = str;
    }

    public void l(String str) {
        this.j = str;
    }

    public void m(String str) {
        this.d = str;
    }

    public void n(String str) {
        this.h = str;
    }

    public void o(String str) {
        this.c = str;
    }

    public void p(String str) {
        this.i = str;
    }

    public void q(String str) {
        this.g = str;
    }

    public void r(String str) {
        this.k = str;
    }

    public void s(String str) {
        this.b = str;
    }

    public void t(String str) {
        this.f = str;
    }

    public void u(String str) {
        this.e = str;
    }

    public void v(Integer num) {
        this.a = num;
    }

    public void w(boolean z) {
        ((lsc) this.j).setValue(Boolean.valueOf(z));
    }
}
