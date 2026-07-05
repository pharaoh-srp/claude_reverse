package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.health.platform.client.proto.g;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonObject;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fg7 implements bz7 {
    public final /* synthetic */ int E;

    public /* synthetic */ fg7(int i) {
        this.E = i;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) throws NoSuchAlgorithmException {
        String value;
        String value2;
        String value3;
        String value4;
        String value5;
        String value6;
        String value7;
        String value8;
        String value9;
        String value10;
        String value11;
        String value12;
        String value13;
        String value14;
        Context context;
        int i = 4;
        int i2 = 3;
        int i3 = 17;
        int i4 = 19;
        int i5 = 9;
        int i6 = 8;
        int i7 = 7;
        int i8 = 6;
        int i9 = 5;
        int i10 = 22;
        int i11 = 2;
        switch (this.E) {
            case 0:
                oqb oqbVar = (oqb) obj;
                oqbVar.getClass();
                LinkedHashSet linkedHashSet = oqbVar.d;
                gg7 gg7Var = new gg7(i11);
                mrg mrgVar = dpf.K;
                kq9 kq9Var = kq9.E;
                kce kceVar = jce.a;
                oqbVar.a(new t7g(new qh1(mrgVar, kceVar.b(cd8.class), null, gg7Var, kq9Var)));
                xai xaiVar = new xai(kceVar.b(lja.class));
                gg7 gg7Var2 = new gg7(i2);
                kq9 kq9Var2 = kq9.G;
                oqbVar.a(new w7f(new qh1(xaiVar, kceVar.b(rc8.class), null, gg7Var2, kq9Var2)));
                linkedHashSet.add(xaiVar);
                xai xaiVar2 = new xai(kceVar.b(j8.class));
                oqbVar.a(new w7f(new qh1(xaiVar2, kceVar.b(sc8.class), null, new z35(21), kq9Var2)));
                oqbVar.a(new w7f(new qh1(xaiVar2, kceVar.b(of7.class), null, new z35(i10), kq9Var2)));
                linkedHashSet.add(xaiVar2);
                xai xaiVar3 = new xai(kceVar.b(zni.class));
                oqbVar.a(new w7f(new qh1(xaiVar3, kceVar.b(rc8.class), null, new z35(23), kq9Var2)));
                oqbVar.a(new w7f(new qh1(xaiVar3, kceVar.b(nf7.class), null, new z35(24), kq9Var2)));
                linkedHashSet.add(xaiVar3);
                return iei.a;
            case 1:
                oqb oqbVar2 = (oqb) obj;
                oqbVar2.getClass();
                kce kceVar2 = jce.a;
                xai xaiVar4 = new xai(kceVar2.b(zni.class));
                gg7 gg7Var3 = new gg7(i);
                kq9 kq9Var3 = kq9.G;
                oqbVar2.a(new w7f(new qh1(xaiVar4, kceVar2.b(lgb.class), null, gg7Var3, kq9Var3)));
                qh1 qh1Var = new qh1(xaiVar4, kceVar2.b(sa6.class), null, new gg7(i9), kq9Var3);
                oqbVar2.a(new w7f(qh1Var));
                qh1Var.g = new p92(new fg7(i11));
                oqbVar2.d.add(xaiVar4);
                return iei.a;
            case 2:
                sa6 sa6Var = (sa6) obj;
                if (sa6Var != null) {
                    fd9.z(sa6Var.d, null);
                    sa6Var.a.unregisterReceiver(sa6Var.g);
                    sa6Var.c.clear();
                }
                return iei.a;
            case 3:
                File file = (File) obj;
                file.getClass();
                String absolutePath = file.getCanonicalFile().getAbsolutePath();
                absolutePath.getClass();
                return new z7g(absolutePath);
            case 4:
                oqb oqbVar3 = (oqb) obj;
                oqbVar3.getClass();
                gg7 gg7Var4 = new gg7(i8);
                mrg mrgVar2 = dpf.K;
                kq9 kq9Var4 = kq9.E;
                kce kceVar3 = jce.a;
                oqbVar3.a(new t7g(new qh1(mrgVar2, kceVar3.b(FirebaseMessaging.class), null, gg7Var4, kq9Var4)));
                oqbVar3.a(new t7g(new qh1(mrgVar2, kceVar3.b(ul7.class), null, new gg7(i7), kq9Var4)));
                oqbVar3.a(new t7g(new qh1(mrgVar2, kceVar3.b(cm7.class), null, new gg7(8), kq9Var4)));
                sq6.C(new qh1(mrgVar2, kceVar3.b(om2.class), null, new gg7(9), kq9Var4), oqbVar3);
                return iei.a;
            case 5:
                oqb oqbVar4 = (oqb) obj;
                oqbVar4.getClass();
                gg7 gg7Var5 = new gg7(10);
                mrg mrgVar3 = dpf.K;
                kq9 kq9Var5 = kq9.F;
                kce kceVar4 = jce.a;
                oqbVar4.a(new ge7(new qh1(mrgVar3, kceVar4.b(fm7.class), null, gg7Var5, kq9Var5)));
                sq6.C(new qh1(mrgVar3, kceVar4.b(pl7.class), null, new gg7(11), kq9.E), oqbVar4);
                b54.u0(oqbVar4.e, new oqb[]{ql7.a});
                return iei.a;
            case 6:
                oqb oqbVar5 = (oqb) obj;
                oqbVar5.getClass();
                kce kceVar5 = jce.a;
                xai xaiVar5 = new xai(kceVar5.b(zni.class));
                zb5 zb5Var = new zb5(13);
                kq9 kq9Var6 = kq9.G;
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(qs2.class), null, zb5Var, kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(wv4.class), null, new zb5(14), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(i8c.class), null, new zb5(15), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(tae.class), null, new zb5(16), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(b1i.class), null, new zb5(i3), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(j1j.class), null, new zb5(18), kq9Var6)));
                oqbVar5.a(new w7f(new qh1(xaiVar5, kceVar5.b(abj.class), null, new zb5(i4), kq9Var6)));
                sq6.E(new qh1(xaiVar5, kceVar5.b(qzb.class), null, new zb5(20), kq9Var6), oqbVar5);
                oqbVar5.d.add(xaiVar5);
                return iei.a;
            case 7:
                synchronized (ycg.c) {
                    List list = ycg.i;
                    int size = list.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        ((bz7) list.get(i12)).invoke(obj);
                    }
                }
                return iei.a;
            case 8:
                oqb oqbVar6 = (oqb) obj;
                oqbVar6.getClass();
                kce kceVar6 = jce.a;
                xai xaiVar6 = new xai(kceVar6.b(zni.class));
                oqbVar6.a(new ge7(new qh1(xaiVar6, kceVar6.b(b98.class), null, new zb5(i10), kq9.F)));
                qh1 qh1Var2 = new qh1(xaiVar6, kceVar6.b(m98.class), null, new zb5(23), kq9.G);
                w7f w7fVar = new w7f(qh1Var2);
                oqbVar6.a(w7fVar);
                pl9 pl9VarB = kceVar6.b(rvg.class);
                qh1 qh1Var3 = w7fVar.a;
                qh1Var3.f = w44.b1(qh1Var3.f, pl9VarB);
                rzd rzdVar = qh1Var3.c;
                rzd rzdVar2 = qh1Var3.a;
                StringBuilder sb = new StringBuilder();
                sq6.D(pl9VarB, sb, ':');
                if (rzdVar == null || (value = rzdVar.getValue()) == null) {
                    value = "";
                }
                oqbVar6.c.put(sq6.w(sb, value, ':', rzdVar2), w7fVar);
                qh1Var2.g = new p92(new fg7(10));
                oqbVar6.d.add(xaiVar6);
                return iei.a;
            case 9:
                oqb oqbVar7 = (oqb) obj;
                oqbVar7.getClass();
                zb5 zb5Var2 = new zb5(21);
                mrg mrgVar4 = dpf.K;
                kq9 kq9Var7 = kq9.E;
                kce kceVar7 = jce.a;
                oqbVar7.a(new t7g(new qh1(mrgVar4, kceVar7.b(p98.class), null, zb5Var2, kq9Var7)));
                sq6.C(new qh1(mrgVar4, kceVar7.b(t88.class), null, new ae5(i11), kq9Var7), oqbVar7);
                return iei.a;
            case 10:
                rvg rvgVar = (rvg) obj;
                if (rvgVar != null) {
                    m98 m98Var = (m98) rvgVar;
                    zo1 zo1Var = m98Var.k;
                    if (zo1Var != null) {
                        zo1Var.a();
                    }
                    m98Var.h.c = null;
                }
                return iei.a;
            case 11:
                oqb oqbVar8 = (oqb) obj;
                oqbVar8.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(String.class), fd9.m, new gg7(13), kq9.E), oqbVar8);
                return iei.a;
            case 12:
                String str = (String) obj;
                str.getClass();
                gd1 gd1Var = id1.e;
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                byte[] bytes = str.getBytes(dj2.a);
                bytes.getClass();
                byte[] bArrDigest = messageDigest.digest(bytes);
                bArrDigest.getClass();
                return id1.b(gd1Var, bArrDigest);
            case 13:
                oqb oqbVar9 = (oqb) obj;
                oqbVar9.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(pl3.class), null, new gg7(14), kq9.E), oqbVar9);
                return iei.a;
            case 14:
                ((Integer) obj).getClass();
                int i13 = ho8.b;
                return iei.a;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                ((Boolean) obj).getClass();
                int i14 = ho8.b;
                return iei.a;
            case 16:
                ((String) obj).getClass();
                return iei.a;
            case g.MAX_FIELD_NUMBER /* 17 */:
                ((pf6) obj).getClass();
                return iei.a;
            case g.AVG_FIELD_NUMBER /* 18 */:
                ckf.s((ekf) obj, 0);
                return iei.a;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return iei.a;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                ((ft2) obj).getClass();
                return new kdg();
            case 21:
                String str2 = "";
                oqb oqbVar10 = (oqb) obj;
                oqbVar10.getClass();
                LinkedHashMap linkedHashMap = oqbVar10.c;
                s79 s79Var = new s79(i11);
                mrg mrgVar5 = dpf.K;
                kq9 kq9Var8 = kq9.E;
                kce kceVar8 = jce.a;
                t7g t7gVarO = sq6.o(new qh1(mrgVar5, kceVar8.b(g09.class), null, s79Var, kq9Var8), oqbVar10);
                pl9 pl9VarB2 = kceVar8.b(rzb.class);
                qh1 qh1Var4 = t7gVarO.a;
                qh1Var4.f = w44.b1(qh1Var4.f, pl9VarB2);
                rzd rzdVar3 = qh1Var4.c;
                rzd rzdVar4 = qh1Var4.a;
                StringBuilder sb2 = new StringBuilder();
                sq6.D(pl9VarB2, sb2, ':');
                if (rzdVar3 == null || (value2 = rzdVar3.getValue()) == null) {
                    value2 = "";
                }
                linkedHashMap.put(sq6.w(sb2, value2, ':', rzdVar4), t7gVarO);
                t7g t7gVarO2 = sq6.o(new qh1(mrgVar5, kceVar8.b(zkg.class), null, new s79(i2), kq9Var8), oqbVar10);
                pl9 pl9VarB3 = kceVar8.b(rzb.class);
                qh1 qh1Var5 = t7gVarO2.a;
                qh1Var5.f = w44.b1(qh1Var5.f, pl9VarB3);
                rzd rzdVar5 = qh1Var5.c;
                rzd rzdVar6 = qh1Var5.a;
                StringBuilder sb3 = new StringBuilder();
                sq6.D(pl9VarB3, sb3, ':');
                if (rzdVar5 == null || (value3 = rzdVar5.getValue()) == null) {
                    value3 = "";
                }
                linkedHashMap.put(sq6.w(sb3, value3, ':', rzdVar6), t7gVarO2);
                t7g t7gVarO3 = sq6.o(new qh1(mrgVar5, kceVar8.b(bhc.class), null, new s79(i), kq9Var8), oqbVar10);
                pl9 pl9VarB4 = kceVar8.b(rzb.class);
                qh1 qh1Var6 = t7gVarO3.a;
                qh1Var6.f = w44.b1(qh1Var6.f, pl9VarB4);
                rzd rzdVar7 = qh1Var6.c;
                rzd rzdVar8 = qh1Var6.a;
                StringBuilder sb4 = new StringBuilder();
                sq6.D(pl9VarB4, sb4, ':');
                if (rzdVar7 == null || (value4 = rzdVar7.getValue()) == null) {
                    value4 = "";
                }
                linkedHashMap.put(sq6.w(sb4, value4, ':', rzdVar8), t7gVarO3);
                t7g t7gVarO4 = sq6.o(new qh1(mrgVar5, kceVar8.b(dhc.class), null, new s79(i9), kq9Var8), oqbVar10);
                pl9 pl9VarB5 = kceVar8.b(rzb.class);
                qh1 qh1Var7 = t7gVarO4.a;
                qh1Var7.f = w44.b1(qh1Var7.f, pl9VarB5);
                rzd rzdVar9 = qh1Var7.c;
                rzd rzdVar10 = qh1Var7.a;
                StringBuilder sb5 = new StringBuilder();
                sq6.D(pl9VarB5, sb5, ':');
                if (rzdVar9 == null || (value5 = rzdVar9.getValue()) == null) {
                    value5 = "";
                }
                linkedHashMap.put(sq6.w(sb5, value5, ':', rzdVar10), t7gVarO4);
                t7g t7gVarO5 = sq6.o(new qh1(mrgVar5, kceVar8.b(jhc.class), null, new s79(i8), kq9Var8), oqbVar10);
                pl9 pl9VarB6 = kceVar8.b(rzb.class);
                qh1 qh1Var8 = t7gVarO5.a;
                qh1Var8.f = w44.b1(qh1Var8.f, pl9VarB6);
                rzd rzdVar11 = qh1Var8.c;
                rzd rzdVar12 = qh1Var8.a;
                StringBuilder sb6 = new StringBuilder();
                sq6.D(pl9VarB6, sb6, ':');
                if (rzdVar11 == null || (value6 = rzdVar11.getValue()) == null) {
                    value6 = "";
                }
                linkedHashMap.put(sq6.w(sb6, value6, ':', rzdVar12), t7gVarO5);
                t7g t7gVarO6 = sq6.o(new qh1(mrgVar5, kceVar8.b(ghc.class), null, new s79(i7), kq9Var8), oqbVar10);
                pl9 pl9VarB7 = kceVar8.b(rzb.class);
                qh1 qh1Var9 = t7gVarO6.a;
                qh1Var9.f = w44.b1(qh1Var9.f, pl9VarB7);
                rzd rzdVar13 = qh1Var9.c;
                rzd rzdVar14 = qh1Var9.a;
                StringBuilder sb7 = new StringBuilder();
                sq6.D(pl9VarB7, sb7, ':');
                if (rzdVar13 == null || (value7 = rzdVar13.getValue()) == null) {
                    value7 = "";
                }
                linkedHashMap.put(sq6.w(sb7, value7, ':', rzdVar14), t7gVarO6);
                t7g t7gVarO7 = sq6.o(new qh1(mrgVar5, kceVar8.b(qhc.class), null, new s79(8), kq9Var8), oqbVar10);
                pl9 pl9VarB8 = kceVar8.b(rzb.class);
                qh1 qh1Var10 = t7gVarO7.a;
                qh1Var10.f = w44.b1(qh1Var10.f, pl9VarB8);
                rzd rzdVar15 = qh1Var10.c;
                rzd rzdVar16 = qh1Var10.a;
                StringBuilder sb8 = new StringBuilder();
                sq6.D(pl9VarB8, sb8, ':');
                if (rzdVar15 == null || (value8 = rzdVar15.getValue()) == null) {
                    value8 = "";
                }
                linkedHashMap.put(sq6.w(sb8, value8, ':', rzdVar16), t7gVarO7);
                t7g t7gVarO8 = sq6.o(new qh1(mrgVar5, kceVar8.b(shc.class), null, new s79(9), kq9Var8), oqbVar10);
                pl9 pl9VarB9 = kceVar8.b(rzb.class);
                qh1 qh1Var11 = t7gVarO8.a;
                qh1Var11.f = w44.b1(qh1Var11.f, pl9VarB9);
                rzd rzdVar17 = qh1Var11.c;
                rzd rzdVar18 = qh1Var11.a;
                StringBuilder sb9 = new StringBuilder();
                sq6.D(pl9VarB9, sb9, ':');
                if (rzdVar17 == null || (value9 = rzdVar17.getValue()) == null) {
                    value9 = "";
                }
                linkedHashMap.put(sq6.w(sb9, value9, ':', rzdVar18), t7gVarO8);
                t7g t7gVarO9 = sq6.o(new qh1(mrgVar5, kceVar8.b(wgc.class), null, new s79(10), kq9Var8), oqbVar10);
                pl9 pl9VarB10 = kceVar8.b(rzb.class);
                qh1 qh1Var12 = t7gVarO9.a;
                qh1Var12.f = w44.b1(qh1Var12.f, pl9VarB10);
                rzd rzdVar19 = qh1Var12.c;
                rzd rzdVar20 = qh1Var12.a;
                StringBuilder sb10 = new StringBuilder();
                sq6.D(pl9VarB10, sb10, ':');
                if (rzdVar19 == null || (value10 = rzdVar19.getValue()) == null) {
                    value10 = "";
                }
                linkedHashMap.put(sq6.w(sb10, value10, ':', rzdVar20), t7gVarO9);
                t7g t7gVarO10 = sq6.o(new qh1(mrgVar5, kceVar8.b(uhc.class), null, new zb5(26), kq9Var8), oqbVar10);
                pl9 pl9VarB11 = kceVar8.b(rzb.class);
                qh1 qh1Var13 = t7gVarO10.a;
                qh1Var13.f = w44.b1(qh1Var13.f, pl9VarB11);
                rzd rzdVar21 = qh1Var13.c;
                rzd rzdVar22 = qh1Var13.a;
                StringBuilder sb11 = new StringBuilder();
                sq6.D(pl9VarB11, sb11, ':');
                if (rzdVar21 == null || (value11 = rzdVar21.getValue()) == null) {
                    value11 = "";
                }
                linkedHashMap.put(sq6.w(sb11, value11, ':', rzdVar22), t7gVarO10);
                t7g t7gVarO11 = sq6.o(new qh1(mrgVar5, kceVar8.b(whc.class), null, new zb5(27), kq9Var8), oqbVar10);
                pl9 pl9VarB12 = kceVar8.b(rzb.class);
                qh1 qh1Var14 = t7gVarO11.a;
                qh1Var14.f = w44.b1(qh1Var14.f, pl9VarB12);
                rzd rzdVar23 = qh1Var14.c;
                rzd rzdVar24 = qh1Var14.a;
                StringBuilder sb12 = new StringBuilder();
                sq6.D(pl9VarB12, sb12, ':');
                if (rzdVar23 == null || (value12 = rzdVar23.getValue()) == null) {
                    value12 = "";
                }
                linkedHashMap.put(sq6.w(sb12, value12, ':', rzdVar24), t7gVarO11);
                t7g t7gVarO12 = sq6.o(new qh1(mrgVar5, kceVar8.b(ehc.class), null, new zb5(28), kq9Var8), oqbVar10);
                pl9 pl9VarB13 = kceVar8.b(rzb.class);
                qh1 qh1Var15 = t7gVarO12.a;
                qh1Var15.f = w44.b1(qh1Var15.f, pl9VarB13);
                rzd rzdVar25 = qh1Var15.c;
                rzd rzdVar26 = qh1Var15.a;
                StringBuilder sb13 = new StringBuilder();
                sq6.D(pl9VarB13, sb13, ':');
                if (rzdVar25 == null || (value13 = rzdVar25.getValue()) == null) {
                    value13 = "";
                }
                linkedHashMap.put(sq6.w(sb13, value13, ':', rzdVar26), t7gVarO12);
                t7g t7gVarO13 = sq6.o(new qh1(mrgVar5, kceVar8.b(hhc.class), null, new zb5(29), kq9Var8), oqbVar10);
                pl9 pl9VarB14 = kceVar8.b(rzb.class);
                qh1 qh1Var16 = t7gVarO13.a;
                qh1Var16.f = w44.b1(qh1Var16.f, pl9VarB14);
                rzd rzdVar27 = qh1Var16.c;
                rzd rzdVar28 = qh1Var16.a;
                StringBuilder sb14 = new StringBuilder();
                sq6.D(pl9VarB14, sb14, ':');
                if (rzdVar27 != null && (value14 = rzdVar27.getValue()) != null) {
                    str2 = value14;
                }
                linkedHashMap.put(sq6.w(sb14, str2, ':', rzdVar28), t7gVarO13);
                oqbVar10.a(new t7g(new qh1(mrgVar5, kceVar8.b(qua.class), null, new s79(0), kq9Var8)));
                sq6.C(new qh1(mrgVar5, kceVar8.b(mga.class), null, new s79(1), kq9Var8), oqbVar10);
                return iei.a;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                oqb oqbVar11 = (oqb) obj;
                oqbVar11.getClass();
                kce kceVar9 = jce.a;
                xai xaiVar7 = new xai(kceVar9.b(zni.class));
                sq6.E(new qh1(xaiVar7, kceVar9.b(vgc.class), null, new gg7(i3), kq9.G), oqbVar11);
                oqbVar11.d.add(xaiVar7);
                return iei.a;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                oh3 oh3Var = (oh3) obj;
                oh3Var.getClass();
                oh3Var.a("JsonPrimitive", new fh9(new q59(i9)));
                oh3Var.a("JsonNull", new fh9(new q59(i8)));
                oh3Var.a("JsonLiteral", new fh9(new q59(i7)));
                oh3Var.a("JsonObject", new fh9(new q59(i6)));
                oh3Var.a("JsonArray", new fh9(new q59(i5)));
                return iei.a;
            case 24:
                oqb oqbVar12 = (oqb) obj;
                oqbVar12.getClass();
                sq6.C(new qh1(dpf.K, jce.a.b(bg9.class), null, new gg7(i4), kq9.E), oqbVar12);
                return iei.a;
            case BuildConfig.VERSION_CODE /* 25 */:
                return JsonObject.toString$lambda$0((Map.Entry) obj);
            case 26:
                List list2 = (List) obj;
                return new x0a(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 27:
                return iei.a;
            case 28:
                oqb oqbVar13 = (oqb) obj;
                oqbVar13.getClass();
                kce kceVar10 = jce.a;
                xai xaiVar8 = new xai(kceVar10.b(zni.class));
                sq6.E(new qh1(xaiVar8, kceVar10.b(q2a.class), null, new gg7(i10), kq9.G), oqbVar13);
                oqbVar13.d.add(xaiVar8);
                return iei.a;
            default:
                Context baseContext = (Context) ((ne4) obj).u0(w00.b);
                while (true) {
                    if (!(baseContext instanceof ContextWrapper)) {
                        context = null;
                    } else if (baseContext instanceof Activity) {
                        context = baseContext;
                    } else {
                        baseContext = ((ContextWrapper) baseContext).getBaseContext();
                    }
                }
                return (Activity) context;
        }
    }
}
