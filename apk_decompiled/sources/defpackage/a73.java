package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.chat.bottomsheet.ChatScreenModalBottomSheetDestination;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.code.remote.stores.b;
import com.anthropic.router.panes.Panes;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a73 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ a73(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        int i2 = 28;
        int i3 = 29;
        int i4 = 3;
        final int i5 = 2;
        z = false;
        boolean z = false;
        final int i6 = 1;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                ((ekf) obj).getClass();
                break;
            case 1:
                ((i90) obj).getClass();
                po4 po4VarW0 = xn5.w0(gp6.e(null, 3), gp6.f(null, 3));
                po4VarW0.d = xn5.Q(2);
                break;
            case 2:
                break;
            case 3:
                ((i90) obj).getClass();
                po4 po4VarW02 = xn5.w0(gp6.e(null, 3), gp6.f(null, 3));
                po4VarW02.d = xn5.Q(2);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                ((ChatScreenModalBottomSheetDestination) obj).getClass();
                break;
            case 8:
                ((ekf) obj).getClass();
                break;
            case 9:
                ((ekf) obj).getClass();
                break;
            case 10:
                final uqc uqcVar = (uqc) obj;
                uqcVar.getClass();
                final Panes panes = uqcVar.a;
                if (!panes.getExtra().isEmpty()) {
                    final int i7 = z ? 1 : 0;
                } else if (!panes.getDetails().isEmpty()) {
                    int size = panes.getMain().size();
                    int size2 = panes.getDetails().size();
                    if (size2 > 0 && (size > 0 || size2 > 1)) {
                    }
                } else if (panes.getMain().size() > 1) {
                }
                break;
            case 11:
                ((ekf) obj).getClass();
                break;
            case 12:
                ((m7f) obj).getClass();
                break;
            case 13:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                kce kceVar = jce.a;
                xai xaiVar = new xai(kceVar.b(zni.class));
                s03 s03Var = new s03(9);
                pl9 pl9VarB = kceVar.b(a.class);
                kq9 kq9Var = kq9.G;
                oqbVar.a(new w7f(new qh1(xaiVar, pl9VarB, null, s03Var, kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(otf.class), null, new s03(10), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(e58.class), null, new s03(11), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(xhe.class), null, new s03(12), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(b.class), null, new s03(13), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(bx1.class), null, new s03(14), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(psf.class), null, new s03(15), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(y36.class), null, new s03(16), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(lpf.class), null, new s03(17), kq9Var)));
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(ue2.class), null, new dx2(25), kq9Var)));
                sq6.E(new qh1(xaiVar, kceVar.b(vx3.class), null, new dx2(26), kq9Var), oqbVar);
                oqbVar.d.add(xaiVar);
                break;
            case 14:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar2 = new xai(kceVar2.b(lja.class));
                sq6.E(new qh1(xaiVar2, kceVar2.b(yw8.class), null, new s03(18), kq9.G), oqbVar2);
                oqbVar2.d.add(xaiVar2);
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                kce kceVar3 = jce.a;
                xai xaiVar3 = new xai(kceVar3.b(zni.class));
                s03 s03Var2 = new s03(20);
                pl9 pl9VarB2 = kceVar3.b(w4e.class);
                kq9 kq9Var2 = kq9.G;
                oqbVar3.a(new w7f(new qh1(xaiVar3, pl9VarB2, null, s03Var2, kq9Var2)));
                sq6.E(new qh1(xaiVar3, kceVar3.b(yw8.class), null, new s03(21), kq9Var2), oqbVar3);
                sq6.E(new qh1(xaiVar3, kceVar3.b(yw8.class), nai.j, new s03(22), kq9Var2), oqbVar3);
                oqbVar3.d.add(xaiVar3);
                break;
            case 16:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                kce kceVar4 = jce.a;
                xai xaiVar4 = new xai(kceVar4.b(zni.class));
                sq6.E(new qh1(xaiVar4, kceVar4.b(ij4.class), null, new eb4(13), kq9.G), oqbVar4);
                oqbVar4.d.add(xaiVar4);
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                chatConversationWithProjectReference.getClass();
                if (!chatConversationWithProjectReference.is_temporary() && chatConversationWithProjectReference.m206getCurrent_leaf_message_uuidsaiyK68() != null) {
                    z = true;
                }
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                kce kceVar5 = jce.a;
                xai xaiVar5 = new xai(kceVar5.b(zni.class));
                eb4 eb4Var = new eb4(14);
                pl9 pl9VarB3 = kceVar5.b(us4.class);
                kq9 kq9Var3 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar5, pl9VarB3, null, eb4Var, kq9Var3)));
                sq6.E(new qh1(xaiVar5, kceVar5.b(pt4.class), null, new eb4(15), kq9Var3), oqbVar5);
                oqbVar5.d.add(xaiVar5);
                break;
            case 21:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                kce kceVar6 = jce.a;
                xai xaiVar6 = new xai(kceVar6.b(zni.class));
                mrg mrgVar = wd6.a;
                eb4 eb4Var2 = new eb4(16);
                pl9 pl9VarB4 = kceVar6.b(hdc.class);
                kq9 kq9Var4 = kq9.G;
                oqbVar6.a(new w7f(new qh1(xaiVar6, pl9VarB4, mrgVar, eb4Var2, kq9Var4)));
                oqbVar6.a(new w7f(new qh1(xaiVar6, kceVar6.b(ss4.class), null, new eb4(17), kq9Var4)));
                oqbVar6.a(new w7f(new qh1(xaiVar6, kceVar6.b(ov4.class), null, new eb4(18), kq9Var4)));
                sq6.E(new qh1(xaiVar6, kceVar6.b(yz4.class), null, new eb4(19), kq9Var4), oqbVar6);
                oqbVar6.d.add(xaiVar6);
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                ij0.v(new qh1(dpf.K, jce.a.b(tg9.class), null, new eb4(23), kq9.F), oqbVar7);
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                oqb oqbVar8 = (oqb) obj;
                oqbVar8.getClass();
                kce kceVar7 = jce.a;
                xai xaiVar7 = new xai(kceVar7.b(lja.class));
                eb4 eb4Var3 = new eb4(24);
                pl9 pl9VarB5 = kceVar7.b(yz8.class);
                kq9 kq9Var5 = kq9.G;
                oqbVar8.a(new w7f(new qh1(xaiVar7, pl9VarB5, null, eb4Var3, kq9Var5)));
                oqbVar8.a(new w7f(new qh1(xaiVar7, kceVar7.b(x4f.class), null, new eb4(25), kq9Var5)));
                oqbVar8.a(new w7f(new qh1(xaiVar7, kceVar7.b(i25.class), null, new eb4(26), kq9Var5)));
                oqbVar8.a(new w7f(new qh1(xaiVar7, kceVar7.b(eo3.class), null, new eb4(27), kq9Var5)));
                ij0.v(new qh1(xaiVar7, kceVar7.b(j25.class), null, new eb4(i2), kq9.F), oqbVar8);
                oqbVar8.d.add(xaiVar7);
                break;
            case 24:
                oqb oqbVar9 = (oqb) obj;
                oqbVar9.getClass();
                kce kceVar8 = jce.a;
                xai xaiVar8 = new xai(kceVar8.b(j8.class));
                eb4 eb4Var4 = new eb4(i3);
                pl9 pl9VarB6 = kceVar8.b(yz8.class);
                kq9 kq9Var6 = kq9.G;
                oqbVar9.a(new w7f(new qh1(xaiVar8, pl9VarB6, null, eb4Var4, kq9Var6)));
                oqbVar9.a(new w7f(new qh1(xaiVar8, kceVar8.b(x4f.class), null, new eb4(20), kq9Var6)));
                oqbVar9.a(new w7f(new qh1(xaiVar8, kceVar8.b(i25.class), null, new eb4(21), kq9Var6)));
                sq6.E(new qh1(xaiVar8, kceVar8.b(eo3.class), null, new eb4(22), kq9Var6), oqbVar9);
                oqbVar9.d.add(xaiVar8);
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                a45 a45Var = (a45) obj;
                if (a45Var instanceof e45) {
                }
                break;
            case 26:
                oqb oqbVar10 = (oqb) obj;
                oqbVar10.getClass();
                z35 z35Var = new z35(6);
                kce kceVar9 = jce.a;
                pl9 pl9VarB7 = kceVar9.b(h86.class);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var7 = kq9.E;
                oqbVar10.a(new t7g(new qh1(mrgVar2, pl9VarB7, null, z35Var, kq9Var7)));
                sq6.C(new qh1(mrgVar2, kceVar9.b(fn0.class), null, new dx2(i2), kq9Var7), oqbVar10);
                break;
            case 27:
                oqb oqbVar11 = (oqb) obj;
                oqbVar11.getClass();
                z35 z35Var2 = new z35(4);
                kce kceVar10 = jce.a;
                pl9 pl9VarB8 = kceVar10.b(fed.class);
                mrg mrgVar3 = dpf.K;
                kq9 kq9Var8 = kq9.E;
                oqbVar11.a(new t7g(new qh1(mrgVar3, pl9VarB8, null, z35Var2, kq9Var8)));
                oqbVar11.a(new t7g(new qh1(mrgVar3, kceVar10.b(h86.class), null, new z35(5), kq9Var8)));
                sq6.C(new qh1(mrgVar3, kceVar10.b(fn0.class), null, new dx2(i3), kq9Var8), oqbVar11);
                break;
            case 28:
                oqb oqbVar12 = (oqb) obj;
                oqbVar12.getClass();
                zb5 zb5Var = new zb5(i5);
                kce kceVar11 = jce.a;
                pl9 pl9VarB9 = kceVar11.b(pb5.class);
                mrg mrgVar4 = dpf.K;
                oqbVar12.a(new ge7(new qh1(mrgVar4, pl9VarB9, null, zb5Var, kq9.F)));
                z35 z35Var3 = new z35(7);
                pl9 pl9VarB10 = kceVar11.b(nb5.class);
                kq9 kq9Var9 = kq9.E;
                oqbVar12.a(new t7g(new qh1(mrgVar4, pl9VarB10, null, z35Var3, kq9Var9)));
                sq6.C(new qh1(mrgVar4, kceVar11.b(dmi.class), null, new zb5(i4), kq9Var9), oqbVar12);
                break;
            default:
                oqb oqbVar13 = (oqb) obj;
                oqbVar13.getClass();
                kce kceVar12 = jce.a;
                xai xaiVar9 = new xai(kceVar12.b(j8.class));
                zb5 zb5Var2 = new zb5(z ? 1 : 0);
                pl9 pl9VarB11 = kceVar12.b(jb5.class);
                kq9 kq9Var10 = kq9.F;
                oqbVar13.a(new ge7(new qh1(xaiVar9, pl9VarB11, null, zb5Var2, kq9Var10)));
                ij0.v(new qh1(xaiVar9, kceVar12.b(bc5.class), null, new zb5(i6), kq9Var10), oqbVar13);
                oqbVar13.d.add(xaiVar9);
                break;
        }
        return ieiVar;
    }
}
