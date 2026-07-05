package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.view.InputEvent;
import android.view.View;
import android.view.Window;
import androidx.concurrent.futures.b;
import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.api.mcp.McpTool;
import com.anthropic.claude.api.notification.TestPushCategory;
import com.anthropic.claude.mcpapps.transport.MessageParams;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class ba9 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public int F;
    public Object G;
    public Object H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba9(Object obj, Object obj2, Object obj3, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }

    private final Object d(Object obj) throws Throwable {
        Object objW;
        l45 l45Var = (l45) this.G;
        m45 m45Var = m45.E;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            meg megVar = (meg) this.H;
            int i2 = ((bi0) this.I).b;
            this.G = l45Var;
            this.F = 1;
            v84 v84Var = (v84) megVar.d.get(new Integer(i2));
            if (v84Var != null) {
                objW = v84Var.w(this);
                if (objW != m45Var) {
                    objW = iei.a;
                }
            } else {
                objW = null;
            }
            if (objW == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        bi0 bi0Var = (bi0) this.I;
        meg megVar2 = (meg) this.H;
        synchronized (bi0Var) {
            if (!fd9.d0(l45Var)) {
                return iei.a;
            }
            if (!((Boolean) megVar2.c.a()).booleanValue()) {
                bi0Var.c = megVar2.e.play(bi0Var.b, 1.0f, 1.0f, 0, -1, 1.0f);
            }
            bi0Var.d = null;
            return iei.a;
        }
    }

    private final Object n(Object obj) {
        sn8 sn8Var = (sn8) this.G;
        int i = this.F;
        iei ieiVar = iei.a;
        int i2 = 1;
        if (i == 0) {
            sf5.h0(obj);
            b3f b3fVarD0 = mpk.d0(new rn8(sn8Var, i2));
            dp dpVar = new dp(sn8Var, (pl3) this.H, (View) this.I, 8);
            this.F = 1;
            Object objA = b3fVarD0.a(new q73(new bae(), 3, dpVar), this);
            m45 m45Var = m45.E;
            if (objA != m45Var) {
                objA = ieiVar;
            }
            if (objA == m45Var) {
                return m45Var;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sf5.h0(obj);
        }
        return ieiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    private final Object p(Object obj) throws Exception {
        String str = this.F;
        try {
            if (str == 0) {
                sf5.h0(obj);
                whg whgVar = (whg) this.H;
                m6b m6bVar = (m6b) this.I;
                akb akbVar = whgVar.b;
                m6bVar.e();
                wa2 wa2VarR = j8.r(j8.K(new b3f(new yjb(akbVar, m6bVar.L, bkb.I, false, null, new qd(rd.f), 0, null, null)), akbVar.a.b()));
                um umVar = new um(m6bVar, 19, whgVar);
                this.G = "STTRepo Error: Mic stream";
                this.F = 1;
                Object objA = wa2VarR.a(umVar, this);
                m45 m45Var = m45.E;
                str = m45Var;
                if (objA == m45Var) {
                    return m45Var;
                }
            } else {
                if (str != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str2 = (String) this.G;
                sf5.h0(obj);
                str = str2;
            }
            return iei.a;
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                List list = xah.a;
                xah.f(e, str, null, null, 28);
            }
            throw e;
        }
    }

    private final Object r(Object obj) throws Exception {
        Throwable th;
        String str;
        m6b m6bVar;
        m45 m45Var = m45.E;
        int i = this.F;
        if (i == 0) {
            sf5.h0(obj);
            m6b m6bVar2 = (m6b) this.I;
            try {
                this.G = "STTRepo Error: Audio encoder loop";
                this.H = m6bVar2;
                this.F = 1;
                d4c.E(this);
                return m45Var;
            } catch (Throwable th2) {
                th = th2;
                str = "STTRepo Error: Audio encoder loop";
                m6bVar = m6bVar2;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m6bVar = (m6b) this.H;
            str = (String) this.G;
            try {
                sf5.h0(obj);
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                th = th3;
            }
        }
        try {
            gid.s(m6bVar);
            throw th;
        } catch (Exception e) {
            if (!(e instanceof CancellationException)) {
                List list = xah.a;
                xah.f(e, str, null, null, 28);
            }
            throw e;
        }
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        Object obj2 = this.I;
        switch (i) {
            case 0:
                return new ba9((b04) this.H, (ca9) obj2, tp4Var, 0);
            case 1:
                return new ba9((bz9) this.G, (kl7) this.H, (ja8) obj2, tp4Var, 1);
            case 2:
                ba9 ba9Var = new ba9((pz7) this.H, (b) obj2, tp4Var, 2);
                ba9Var.G = obj;
                return ba9Var;
            case 3:
                ba9 ba9Var2 = new ba9((rz7) this.H, (vya) obj2, tp4Var, 3);
                ba9Var2.G = obj;
                return ba9Var2;
            case 4:
                return new ba9((y3b) this.G, (McpTool) this.H, (z4b) obj2, tp4Var, 4);
            case 5:
                return new ba9((y3b) this.G, (McpServer) this.H, (z4b) obj2, tp4Var, 5);
            case 6:
                return new ba9((u5b) this.G, (Uri) this.H, (InputEvent) obj2, tp4Var, 6);
            case 7:
                return new ba9((bz7) this.G, (w1i) this.H, (nwb) obj2, tp4Var, 7);
            case 8:
                ba9 ba9Var3 = new ba9((ql4) this.H, (l1c) obj2, tp4Var, 8);
                ba9Var3.G = obj;
                return ba9Var3;
            case 9:
                return new ba9((v77) this.G, (t6d) this.H, (pz7) obj2, tp4Var, 9);
            case 10:
                return new ba9((pmd) this.G, (String) this.H, (String) obj2, tp4Var, 10);
            case 11:
                return new ba9((kzd) this.G, (TestPushCategory) this.H, (ybg) obj2, tp4Var, 11);
            case 12:
                ba9 ba9Var4 = new ba9((r4e) this.H, (jx8) obj2, tp4Var, 12);
                ba9Var4.G = obj;
                return ba9Var4;
            case 13:
                ba9 ba9Var5 = new ba9((kx8) this.H, (s4e) obj2, tp4Var, 13);
                ba9Var5.G = obj;
                return ba9Var5;
            case 14:
                return new ba9((oge) this.G, (nwb) this.H, (nwb) obj2, tp4Var, 14);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return new ba9((ua9) this.G, (v4g) this.H, (a80) obj2, tp4Var, 15);
            case 16:
                return new ba9((View) this.G, (Bitmap) this.H, (Window) obj2, tp4Var, 16);
            case g.MAX_FIELD_NUMBER /* 17 */:
                ba9 ba9Var6 = new ba9((sc6) this.H, (raf) obj2, tp4Var, 17);
                ba9Var6.G = obj;
                return ba9Var6;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ba9 ba9Var7 = new ba9((raf) this.H, (pz7) obj2, tp4Var, 18);
                ba9Var7.G = obj;
                return ba9Var7;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ba9 ba9Var8 = new ba9((jsc) obj2, tp4Var, 19);
                ba9Var8.H = obj;
                return ba9Var8;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ba9 ba9Var9 = new ba9((wlg) this.H, (a80) obj2, tp4Var, 20);
                ba9Var9.G = obj;
                return ba9Var9;
            case 21:
                return new ba9((jrf) this.G, (cpc) this.H, (zv5) obj2, tp4Var, 21);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                ba9 ba9Var10 = new ba9((g81) this.H, (String) obj2, tp4Var, 22);
                ba9Var10.G = obj;
                return ba9Var10;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return new ba9((e8d) this.G, (zub) this.H, (mag) obj2, tp4Var, 23);
            case 24:
                ba9 ba9Var11 = new ba9((meg) this.H, (bi0) obj2, tp4Var, 24);
                ba9Var11.G = obj;
                return ba9Var11;
            case BuildConfig.VERSION_CODE /* 25 */:
                return new ba9((sn8) this.G, (pl3) this.H, (View) obj2, tp4Var, 25);
            case 26:
                return new ba9((whg) this.H, (m6b) obj2, tp4Var, 26);
            case 27:
                return new ba9((m6b) obj2, tp4Var, 27);
            case 28:
                ba9 ba9Var12 = new ba9((nrg) this.H, (np5) obj2, tp4Var, 28);
                ba9Var12.G = obj;
                return ba9Var12;
            default:
                return new ba9((String) this.G, (op3) this.H, (nwb) obj2, tp4Var, 29);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.E;
        m45 m45Var = m45.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 1:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 2:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 3:
                return ((ba9) create((MessageParams) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 4:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 5:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 6:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 7:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 8:
                return ((ba9) create((aid) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 9:
                ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 10:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 11:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 12:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 13:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 14:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 16:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.MAX_FIELD_NUMBER /* 17 */:
                return ((ba9) create((paf) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.AVG_FIELD_NUMBER /* 18 */:
                return ((ba9) create((h9f) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 21:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 24:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case BuildConfig.VERSION_CODE /* 25 */:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 26:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            case 27:
                ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
                return m45Var;
            case 28:
                return ((ba9) create((xne) obj, (tp4) obj2)).invokeSuspend(ieiVar);
            default:
                return ((ba9) create((l45) obj, (tp4) obj2)).invokeSuspend(ieiVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        if (defpackage.d4c.K(2000, r17) == r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05d8, code lost:
    
        if (defpackage.ybg.b(r3, r0, null, r17, 14) == r1) goto L247;
     */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba9(Object obj, Object obj2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.H = obj;
        this.I = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ba9(Object obj, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.I = obj;
    }
}
