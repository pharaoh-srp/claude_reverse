package defpackage;

import android.content.res.Configuration;
import android.os.SystemClock;
import android.view.KeyEvent;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.design.icon.a;
import com.anthropic.claude.mcpapps.transport.ContainerDimensions;
import com.anthropic.claude.mcpapps.transport.DeviceCapabilities;
import com.anthropic.claude.mcpapps.transport.HostContext;
import com.anthropic.claude.mcpapps.transport.RequestDisplayModeParams;
import com.anthropic.claude.mcpapps.transport.SafeAreaInsets;
import com.anthropic.claude.mcpapps.transport.SizeChangedParams;
import com.anthropic.claude.mcpapps.transport.ToolInfo;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lok {
    public static final ta4 a = new ta4(134349331, false, new sb4(18));
    public static final ta4 b = new ta4(-1002017193, false, new sb4(19));

    public static final void a(dk0 dk0Var, bz7 bz7Var, iqb iqbVar, oxf oxfVar, mnc mncVar, ld4 ld4Var, int i) {
        e18 e18Var;
        dk0Var.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(311350221);
        int i2 = i | (e18Var2.d(dk0Var.ordinal()) ? 4 : 2) | (e18Var2.h(bz7Var) ? 32 : 16) | (e18Var2.f(oxfVar) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE) | (e18Var2.f(mncVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        if (e18Var2.Q(i2 & 1, (i2 & 9363) != 9362)) {
            e18Var2.V();
            if ((i & 1) != 0 && !e18Var2.A()) {
                e18Var2.T();
            }
            e18Var2.q();
            Object objN = e18Var2.N();
            if (objN == jd4.a) {
                objN = w44.p1(dk0.J);
                e18Var2.k0(objN);
            }
            e18Var = e18Var2;
            idi.e(a.a(ud0.y1, e18Var2), d4c.j0(R.string.font_style_setting_title, e18Var2), dk0Var, (List) objN, new ic4(19), new ic4(20), bz7Var, iqbVar, false, null, oxfVar, mncVar, MTTypesetterKt.kLineSkipLimitMultiplier, null, null, 0L, 0, e18Var, ((i2 << 6) & 896) | 8 | (3670016 & (i2 << 15)) | 12582912, i2 & 64512);
        } else {
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new uo((Enum) dk0Var, bz7Var, iqbVar, oxfVar, mncVar, i, 22);
        }
    }

    public static final void b(String str, fj0 fj0Var, SafeAreaInsets safeAreaInsets, ContainerDimensions containerDimensions, zy7 zy7Var, bz7 bz7Var, iqb iqbVar, bg9 bg9Var, mn5 mn5Var, b4e b4eVar, ld4 ld4Var, int i) {
        int i2;
        zy7 zy7Var2;
        e18 e18Var;
        bg9 bg9Var2;
        mn5 mn5Var2;
        b4e b4eVar2;
        r7e r7eVarS;
        aza azaVar;
        bg9 bg9Var3;
        int i3;
        mn5 mn5Var3;
        b4e b4eVar3;
        lz1 lz1Var;
        int i4;
        pz7 pz7Var;
        vza vzaVar;
        bg9 bg9Var4;
        bg9 bg9Var5;
        Object e7Var;
        String str2;
        bg9 bg9Var6;
        str.getClass();
        fj0Var.getClass();
        safeAreaInsets.getClass();
        zy7Var.getClass();
        bz7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-1571396477);
        if ((i & 6) == 0) {
            i2 = (e18Var2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e18Var2.f(fj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? e18Var2.f(safeAreaInsets) : e18Var2.h(safeAreaInsets) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(containerDimensions) : e18Var2.h(containerDimensions) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE;
        }
        if ((i & 24576) == 0) {
            zy7Var2 = zy7Var;
            i2 |= e18Var2.h(zy7Var2) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
        } else {
            zy7Var2 = zy7Var;
        }
        if ((196608 & i) == 0) {
            i2 |= e18Var2.h(bz7Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e18Var2.f(iqbVar) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= 268435456;
        }
        if (e18Var2.Q(i2 & 1, (i2 & 306783379) != 306783378)) {
            e18Var2.V();
            int i5 = i & 1;
            lz1 lz1Var2 = jd4.a;
            if (i5 == 0 || e18Var2.A()) {
                m7f m7fVarN = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF = e18Var2.f(null) | e18Var2.f(m7fVarN);
                Object objN = e18Var2.N();
                if (zF || objN == lz1Var2) {
                    objN = m7fVarN.a(jce.a.b(bg9.class), null, null);
                    e18Var2.k0(objN);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                bg9Var3 = (bg9) objN;
                m7f m7fVarN2 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF2 = e18Var2.f(null) | e18Var2.f(m7fVarN2);
                Object objN2 = e18Var2.N();
                if (zF2 || objN2 == lz1Var2) {
                    objN2 = m7fVarN2.a(jce.a.b(mn5.class), null, null);
                    e18Var2.k0(objN2);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                mn5 mn5Var4 = (mn5) objN2;
                m7f m7fVarN3 = sq6.n(e18Var2, -1168520582, e18Var2, -1633490746);
                boolean zF3 = e18Var2.f(null) | e18Var2.f(m7fVarN3);
                Object objN3 = e18Var2.N();
                if (zF3 || objN3 == lz1Var2) {
                    objN3 = m7fVarN3.a(jce.a.b(b4e.class), null, null);
                    e18Var2.k0(objN3);
                }
                e18Var2.p(false);
                e18Var2.p(false);
                i3 = i2 & (-2143289345);
                mn5Var3 = mn5Var4;
                b4eVar3 = (b4e) objN3;
            } else {
                e18Var2.T();
                i3 = i2 & (-2143289345);
                bg9Var3 = bg9Var;
                mn5Var3 = mn5Var;
                b4eVar3 = b4eVar;
            }
            int i6 = i3;
            e18Var2.q();
            Object obj = ((LinkedHashMap) fj0Var.F).get(str);
            if (obj != null) {
                ((qo0) fj0Var.G).remove(str);
            } else {
                obj = null;
            }
            vza vzaVar2 = (vza) obj;
            if (vzaVar2 == null) {
                r7eVarS = e18Var2.s();
                if (r7eVarS != null) {
                    azaVar = new aza(str, fj0Var, safeAreaInsets, containerDimensions, zy7Var2, bz7Var, iqbVar, bg9Var3, mn5Var3, b4eVar3, i, 0);
                    r7eVarS.d = azaVar;
                }
                return;
            }
            mn5 mn5Var5 = mn5Var3;
            b4e b4eVar4 = b4eVar3;
            pz7 pz7VarJ = j(e18Var2);
            boolean zF4 = v40.F(e18Var2);
            Locale locale = ((Configuration) e18Var2.j(w00.a)).getLocales().get(0);
            b4eVar4.getClass();
            boolean zF5 = e18Var2.f("1.260618.10");
            Object objN4 = e18Var2.N();
            if (zF5 || objN4 == lz1Var2) {
                objN4 = "claude-android/1.260618.10";
                e18Var2.k0("claude-android/1.260618.10");
            }
            String str3 = (String) objN4;
            Object objN5 = e18Var2.N();
            if (objN5 == lz1Var2) {
                objN5 = uya.a();
                e18Var2.k0(objN5);
            }
            JsonObject jsonObject = (JsonObject) objN5;
            boolean zG = e18Var2.g(zF4) | e18Var2.f(locale) | e18Var2.f(str3) | ((i6 & 896) == 256 || ((i6 & 512) != 0 && e18Var2.f(safeAreaInsets))) | ((i6 & 7168) == 2048 || ((i6 & FreeTypeConstants.FT_LOAD_MONOCHROME) != 0 && e18Var2.f(containerDimensions)));
            Object objN6 = e18Var2.N();
            if (zG || objN6 == lz1Var2) {
                lz1Var = lz1Var2;
                i4 = i6;
                pz7Var = pz7VarJ;
                vzaVar = vzaVar2;
                bg9Var4 = bg9Var3;
                HostContext hostContext = new HostContext(zF4 ? "dark" : "light", "mobile", locale.toLanguageTag(), mn5Var5.g(), str3, "fullscreen", x44.X("inline", "fullscreen"), containerDimensions, new DeviceCapabilities(Boolean.TRUE, Boolean.FALSE), safeAreaInsets, jsonObject, null);
                e18Var2.k0(hostContext);
                objN6 = hostContext;
            } else {
                pz7Var = pz7VarJ;
                bg9Var4 = bg9Var3;
                lz1Var = lz1Var2;
                i4 = i6;
                vzaVar = vzaVar2;
            }
            HostContext hostContext2 = (HostContext) objN6;
            boolean zF6 = e18Var2.f(vzaVar) | e18Var2.h(hostContext2) | e18Var2.h(bg9Var4);
            Object objN7 = e18Var2.N();
            lz1 lz1Var3 = lz1Var;
            if (zF6 || objN7 == lz1Var3) {
                bg9 bg9Var7 = bg9Var4;
                objN7 = new hza(vzaVar, hostContext2, bg9Var7, null, 0);
                bg9Var5 = bg9Var7;
                e18Var2.k0(objN7);
            } else {
                bg9Var5 = bg9Var4;
            }
            bp8 bp8Var = HostContext.Companion;
            fd9.i(e18Var2, (pz7) objN7, hostContext2);
            m4a m4aVar = (m4a) e18Var2.j(tda.a);
            int i7 = i4 & 14;
            int i8 = i4 & 112;
            boolean zF7 = (i7 == 4) | e18Var2.f(vzaVar) | (i8 == 32) | e18Var2.h(bg9Var5) | e18Var2.h(hostContext2) | e18Var2.h(m4aVar);
            Object objN8 = e18Var2.N();
            if (zF7 || objN8 == lz1Var3) {
                e7Var = new e7(vzaVar, fj0Var, str, hostContext2, m4aVar, bg9Var5, 6);
                str2 = str;
                bg9Var6 = bg9Var5;
                e18Var2.k0(e7Var);
            } else {
                e7Var = objN8;
                bg9Var6 = bg9Var5;
                str2 = str;
            }
            fd9.e(m4aVar, vzaVar, (bz7) e7Var, e18Var2);
            e18Var2.X(1716652611, str2);
            pz7 pz7Var2 = pz7Var;
            boolean zF8 = e18Var2.f(vzaVar) | (i7 == 4) | ((i4 & 458752) == 131072) | (i8 == 32) | ((i4 & 57344) == 16384) | e18Var2.f(pz7Var2);
            Object objN9 = e18Var2.N();
            if (zF8 || objN9 == lz1Var3) {
                e7 e7Var2 = new e7(vzaVar, pz7Var2, str2, bz7Var, fj0Var, zy7Var);
                e18Var2.k0(e7Var2);
                objN9 = e7Var2;
            }
            e18Var = e18Var2;
            uj5.a((bz7) objN9, iqbVar, null, e18Var, (i4 >> 15) & 112, 4);
            e18Var.p(false);
            bg9Var2 = bg9Var6;
            b4eVar2 = b4eVar4;
            mn5Var2 = mn5Var5;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            bg9Var2 = bg9Var;
            mn5Var2 = mn5Var;
            b4eVar2 = b4eVar;
        }
        r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            azaVar = new aza(str, fj0Var, safeAreaInsets, containerDimensions, zy7Var, bz7Var, iqbVar, bg9Var2, mn5Var2, b4eVar2, i, 1);
            r7eVarS.d = azaVar;
        }
    }

    public static final void c(vza vzaVar, bg9 bg9Var, HostContext hostContext) {
        aya ayaVar = vzaVar.a;
        bg9Var.getClass();
        ayaVar.d("ui/notifications/host-context-changed", ch9.i(bg9Var.c(hostContext, HostContext.Companion.serializer())));
        vzaVar.u = hostContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:165:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x062f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0661  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x075a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.vya r65, final defpackage.fj0 r66, final defpackage.iqb r67, final boolean r68, final defpackage.bz7 r69, final defpackage.bz7 r70, final defpackage.pz7 r71, final defpackage.pz7 r72, final defpackage.bz7 r73, final defpackage.pz7 r74, final defpackage.bz7 r75, final defpackage.pz7 r76, final defpackage.bz7 r77, final defpackage.rz7 r78, final defpackage.rz7 r79, defpackage.mn5 r80, defpackage.bg9 r81, defpackage.b4e r82, defpackage.ze0 r83, defpackage.n3f r84, defpackage.rya r85, final boolean r86, defpackage.ld4 r87, final int r88) {
        /*
            Method dump skipped, instruction units count: 2517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lok.d(vya, fj0, iqb, boolean, bz7, bz7, pz7, pz7, bz7, pz7, bz7, pz7, bz7, rz7, rz7, mn5, bg9, b4e, ze0, n3f, rya, boolean, ld4, int):void");
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [gza] */
    /* JADX WARN: Type inference failed for: r9v1, types: [gza] */
    public static final kxa e(pz7 pz7Var, pz7 pz7Var2, pz7 pz7Var3, bz7 bz7Var, pz7 pz7Var4, final vza vzaVar, final bz7 bz7Var2, bz7 bz7Var3, isc iscVar, nwb nwbVar, fj0 fj0Var, vya vyaVar, final bz7 bz7Var4, rz7 rz7Var) {
        final int i = 0;
        final int i2 = 1;
        return new kxa(new fza(vzaVar, 0), new fza(vzaVar, 1), (gza) new bz7() { // from class: gza
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str;
                int i3 = i;
                bz7 bz7Var5 = bz7Var2;
                vza vzaVar2 = vzaVar;
                switch (i3) {
                    case 0:
                        isc iscVar2 = vzaVar2.m;
                        isc iscVar3 = vzaVar2.i;
                        SizeChangedParams sizeChangedParams = (SizeChangedParams) obj;
                        sizeChangedParams.getClass();
                        zfa.a.getClass();
                        boolean zB = yfa.b();
                        sfa sfaVar = sfa.INFO;
                        if (zB) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj2)).getClass();
                                arrayList.add(obj2);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String strO = grc.o(sizeChangedParams.getHeight(), iscVar3.h(), "size-changed: height=", "cssPx, current=");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfaVar, "McpAppViewHost", strO);
                                }
                            }
                        }
                        boolean z = iscVar3.h() == 0;
                        iscVar3.i(sizeChangedParams.getHeight());
                        int height = sizeChangedParams.getHeight();
                        if (iscVar2.h() == 0 && height > 0) {
                            vzaVar2.l = vzaVar2.c();
                            iscVar2.i(height);
                            vzaVar2.k = SystemClock.elapsedRealtime();
                        }
                        if (z && iscVar3.h() > 0) {
                            zfa.a.getClass();
                            if (yfa.b()) {
                                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : copyOnWriteArrayList2) {
                                    ((n30) ((zfa) obj3)).getClass();
                                    arrayList2.add(obj3);
                                }
                                if (!arrayList2.isEmpty()) {
                                    zfa.a.getClass();
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        ((n30) ((zfa) it2.next())).b(sfaVar, "McpAppViewHost", "Dispatching resize after height transition");
                                    }
                                }
                            }
                            vzaVar2.a.c();
                        }
                        if (bz7Var5 != null) {
                            bz7Var5.invoke(sizeChangedParams);
                        }
                        return iei.a;
                    default:
                        RequestDisplayModeParams requestDisplayModeParams = (RequestDisplayModeParams) obj;
                        requestDisplayModeParams.getClass();
                        return ((x44.r(requestDisplayModeParams.getMode(), "inline") && !vzaVar2.d()) || bz7Var5 == null || (str = (String) bz7Var5.invoke(requestDisplayModeParams)) == null) ? "inline" : str;
                }
            }
        }, pz7Var, new f7(13, bz7Var3), new f25(iscVar, 26, nwbVar), new ny4(vzaVar, fj0Var, vyaVar, 20), pz7Var2, (gza) new bz7() { // from class: gza
            @Override // defpackage.bz7
            public final Object invoke(Object obj) {
                String str;
                int i3 = i2;
                bz7 bz7Var5 = bz7Var4;
                vza vzaVar2 = vzaVar;
                switch (i3) {
                    case 0:
                        isc iscVar2 = vzaVar2.m;
                        isc iscVar3 = vzaVar2.i;
                        SizeChangedParams sizeChangedParams = (SizeChangedParams) obj;
                        sizeChangedParams.getClass();
                        zfa.a.getClass();
                        boolean zB = yfa.b();
                        sfa sfaVar = sfa.INFO;
                        if (zB) {
                            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : copyOnWriteArrayList) {
                                ((n30) ((zfa) obj2)).getClass();
                                arrayList.add(obj2);
                            }
                            if (!arrayList.isEmpty()) {
                                zfa.a.getClass();
                                String strO = grc.o(sizeChangedParams.getHeight(), iscVar3.h(), "size-changed: height=", "cssPx, current=");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((n30) ((zfa) it.next())).b(sfaVar, "McpAppViewHost", strO);
                                }
                            }
                        }
                        boolean z = iscVar3.h() == 0;
                        iscVar3.i(sizeChangedParams.getHeight());
                        int height = sizeChangedParams.getHeight();
                        if (iscVar2.h() == 0 && height > 0) {
                            vzaVar2.l = vzaVar2.c();
                            iscVar2.i(height);
                            vzaVar2.k = SystemClock.elapsedRealtime();
                        }
                        if (z && iscVar3.h() > 0) {
                            zfa.a.getClass();
                            if (yfa.b()) {
                                CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj3 : copyOnWriteArrayList2) {
                                    ((n30) ((zfa) obj3)).getClass();
                                    arrayList2.add(obj3);
                                }
                                if (!arrayList2.isEmpty()) {
                                    zfa.a.getClass();
                                    Iterator it2 = arrayList2.iterator();
                                    while (it2.hasNext()) {
                                        ((n30) ((zfa) it2.next())).b(sfaVar, "McpAppViewHost", "Dispatching resize after height transition");
                                    }
                                }
                            }
                            vzaVar2.a.c();
                        }
                        if (bz7Var5 != null) {
                            bz7Var5.invoke(sizeChangedParams);
                        }
                        return iei.a;
                    default:
                        RequestDisplayModeParams requestDisplayModeParams = (RequestDisplayModeParams) obj;
                        requestDisplayModeParams.getClass();
                        return ((x44.r(requestDisplayModeParams.getMode(), "inline") && !vzaVar2.d()) || bz7Var5 == null || (str = (String) bz7Var5.invoke(requestDisplayModeParams)) == null) ? "inline" : str;
                }
            }
        }, pz7Var3, bz7Var, new h9a(vzaVar, rz7Var, fj0Var, vyaVar, 1), pz7Var4, 32);
    }

    public static final HostContext f(boolean z, Locale locale, mn5 mn5Var, String str, JsonObject jsonObject, ToolInfo toolInfo, int i) {
        return new HostContext(z ? "dark" : "light", "mobile", locale.toLanguageTag(), mn5Var.g(), str, "inline", x44.X("inline", "fullscreen"), i > 0 ? new ContainerDimensions(Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) 5000, 6, (mq5) null) : null, new DeviceCapabilities(Boolean.TRUE, Boolean.FALSE), new SafeAreaInsets(0, 0, 0, 0), jsonObject, toolInfo);
    }

    public static ck6 g(av6 av6Var, yj6 yj6Var) {
        Stream streamFilter;
        if (av6Var.f()) {
            av6Var.e();
            streamFilter = euk.s(yj6Var, yj6.class).filter(new qu6(av6Var, yj6Var, 1));
        } else {
            av6Var.e();
            streamFilter = euk.s(yj6Var, yj6.class).filter(new qu6(av6Var, yj6Var, 0));
        }
        ck6 ck6Var = (ck6) streamFilter.collect(Collectors.toCollection(new ui2(2)));
        av6Var.e();
        return ck6Var;
    }

    public static doe h(qh9 qh9Var) {
        try {
            String strM = qh9Var.s("id").m();
            bh9 bh9VarS = qh9Var.s("current_locale");
            String strM2 = bh9VarS != null ? bh9VarS.m() : null;
            strM.getClass();
            return new doe(strM, strM2);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Application", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Application", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Application", e3);
            return null;
        }
    }

    public static final boolean i(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static final pz7 j(ld4 ld4Var) {
        e18 e18Var = (e18) ld4Var;
        Object objN = e18Var.N();
        lz1 lz1Var = jd4.a;
        if (objN == lz1Var) {
            objN = mpk.P(null);
            e18Var.k0(objN);
        }
        nwb nwbVar = (nwb) objN;
        Object objN2 = e18Var.N();
        if (objN2 == lz1Var) {
            objN2 = new ol5(20, nwbVar);
            e18Var.k0(objN2);
        }
        fd9.d(iei.a, (bz7) objN2, e18Var);
        vc vcVar = new vc(2);
        Object objN3 = e18Var.N();
        if (objN3 == lz1Var) {
            objN3 = new ol5(21, nwbVar);
            e18Var.k0(objN3);
        }
        xpa xpaVarD0 = sf5.d0(vcVar, (bz7) objN3, e18Var, 48);
        boolean zF = e18Var.f(xpaVarD0);
        Object objN4 = e18Var.N();
        if (zF || objN4 == lz1Var) {
            objN4 = new lpa(xpaVarD0, 4, nwbVar);
            e18Var.k0(objN4);
        }
        return (pz7) objN4;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c9 A[LOOP:2: B:52:0x01c3->B:54:0x01c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0291  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.rm r25, defpackage.tl r26, defpackage.tl r27, defpackage.yb r28, defpackage.pm r29, defpackage.sm r30, defpackage.qm r31, defpackage.qm r32, defpackage.vp4 r33) {
        /*
            Method dump skipped, instruction units count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lok.k(java.lang.String, java.lang.String, java.lang.String, rm, tl, tl, yb, pm, sm, qm, qm, vp4):java.lang.Object");
    }

    public static void l(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                mr9.h(ij0.g(i2, "at index ", new StringBuilder(String.valueOf(i2).length() + 9)));
                return;
            }
        }
    }
}
