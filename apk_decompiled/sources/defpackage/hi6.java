package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.anthropic.claude.analytics.health.HealthMetricAction;
import com.anthropic.claude.api.experience.ExperienceToggle;
import com.anthropic.claude.api.model.ModelSection;
import com.anthropic.claude.api.model.ModelSelectorConfig;
import com.anthropic.claude.api.model.ModelSelectorEntry;
import com.anthropic.claude.code.remote.j;
import com.anthropic.claude.core.telemetry.SilentException;
import com.anthropic.claude.types.strings.ModelId;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class hi6 implements dxg, sr9 {
    public static final byte[] L = {0, 7, 8, 15};
    public static final byte[] M = {0, 119, -120, -1};
    public static final byte[] N = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;

    public hi6(pkc pkcVar, spb spbVar, String str) {
        pkcVar.getClass();
        spbVar.getClass();
        str.getClass();
        this.E = pkcVar;
        this.F = spbVar;
        this.G = str;
        final int i = 2;
        final int i2 = 0;
        if (!pkcVar.a().c().isEmpty()) {
            ModelSelectorConfig modelSelectorConfigF = pkcVar.a().f(str);
            List<ModelSelectorEntry> models = modelSelectorConfigF != null ? modelSelectorConfigF.getModels() : null;
            if (models == null || models.isEmpty()) {
                SilentException.a(new SilentException(ij0.j("model_selector_config[", str, "] is absent or empty")), ozf.F, false, 2);
            }
        }
        a5 a5Var = a5.N;
        this.H = mpk.x(new zy7(this) { // from class: tx3
            public final /* synthetic */ hi6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i3 = i2;
                hi6 hi6Var = this.F;
                switch (i3) {
                    case 0:
                        ModelSelectorConfig modelSelectorConfigF2 = ((pkc) hi6Var.E).a().f((String) hi6Var.G);
                        List<ModelSelectorEntry> models2 = modelSelectorConfigF2 != null ? modelSelectorConfigF2.getModels() : null;
                        if (models2 == null) {
                            models2 = lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : models2) {
                            if (((ModelSelectorEntry) obj).getSection() != ModelSection.DEPRECATED) {
                                arrayList.add(obj);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (hashSet.add(ModelId.m1058boximpl(((ModelSelectorEntry) obj2).m364getIdi4oh0I()))) {
                                arrayList2.add(obj2);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List listP = hi6Var.p();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listP) {
                            if (((ModelSelectorEntry) obj3).getSection() == ModelSection.MAIN) {
                                arrayList3.add(obj3);
                            }
                        }
                        return arrayList3;
                    default:
                        List listP2 = hi6Var.p();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listP2) {
                            if (((ModelSelectorEntry) obj4).getSection() == ModelSection.OVERFLOW) {
                                arrayList4.add(obj4);
                            }
                        }
                        return arrayList4;
                }
            }
        }, a5Var);
        final int i3 = 1;
        this.I = mpk.x(new zy7(this) { // from class: tx3
            public final /* synthetic */ hi6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i3;
                hi6 hi6Var = this.F;
                switch (i32) {
                    case 0:
                        ModelSelectorConfig modelSelectorConfigF2 = ((pkc) hi6Var.E).a().f((String) hi6Var.G);
                        List<ModelSelectorEntry> models2 = modelSelectorConfigF2 != null ? modelSelectorConfigF2.getModels() : null;
                        if (models2 == null) {
                            models2 = lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : models2) {
                            if (((ModelSelectorEntry) obj).getSection() != ModelSection.DEPRECATED) {
                                arrayList.add(obj);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (hashSet.add(ModelId.m1058boximpl(((ModelSelectorEntry) obj2).m364getIdi4oh0I()))) {
                                arrayList2.add(obj2);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List listP = hi6Var.p();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listP) {
                            if (((ModelSelectorEntry) obj3).getSection() == ModelSection.MAIN) {
                                arrayList3.add(obj3);
                            }
                        }
                        return arrayList3;
                    default:
                        List listP2 = hi6Var.p();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listP2) {
                            if (((ModelSelectorEntry) obj4).getSection() == ModelSection.OVERFLOW) {
                                arrayList4.add(obj4);
                            }
                        }
                        return arrayList4;
                }
            }
        }, a5Var);
        this.J = mpk.x(new zy7(this) { // from class: tx3
            public final /* synthetic */ hi6 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i32 = i;
                hi6 hi6Var = this.F;
                switch (i32) {
                    case 0:
                        ModelSelectorConfig modelSelectorConfigF2 = ((pkc) hi6Var.E).a().f((String) hi6Var.G);
                        List<ModelSelectorEntry> models2 = modelSelectorConfigF2 != null ? modelSelectorConfigF2.getModels() : null;
                        if (models2 == null) {
                            models2 = lm6.E;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : models2) {
                            if (((ModelSelectorEntry) obj).getSection() != ModelSection.DEPRECATED) {
                                arrayList.add(obj);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : arrayList) {
                            if (hashSet.add(ModelId.m1058boximpl(((ModelSelectorEntry) obj2).m364getIdi4oh0I()))) {
                                arrayList2.add(obj2);
                            }
                        }
                        return arrayList2;
                    case 1:
                        List listP = hi6Var.p();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listP) {
                            if (((ModelSelectorEntry) obj3).getSection() == ModelSection.MAIN) {
                                arrayList3.add(obj3);
                            }
                        }
                        return arrayList3;
                    default:
                        List listP2 = hi6Var.p();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listP2) {
                            if (((ModelSelectorEntry) obj4).getSection() == ModelSection.OVERFLOW) {
                                arrayList4.add(obj4);
                            }
                        }
                        return arrayList4;
                }
            }
        }, a5Var);
        this.K = mpk.x(new o4(3, this), a5Var);
    }

    public static ci6 A(dg2 dg2Var) {
        byte[] bArr;
        int iG = dg2Var.g(16);
        dg2Var.o(4);
        int iG2 = dg2Var.g(2);
        boolean zF = dg2Var.f();
        dg2Var.o(1);
        byte[] bArr2 = tpi.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = dg2Var.g(16);
                int iG4 = dg2Var.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    dg2Var.j(bArr2, iG3);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    dg2Var.j(bArr, iG4);
                }
            }
            return new ci6(iG, zF, bArr2, bArr);
        }
        dg2Var.o(dg2Var.g(8) * 16);
        bArr = bArr2;
        return new ci6(iG, zF, bArr2, bArr);
    }

    public static ro6 C(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            dq9 dq9VarD = dq9.D(byteArrayInputStream, mc7.a());
            byteArrayInputStream.close();
            return new ro6(7, (aq9) ((dq9) xv8.m(dq9VarD).F).v());
        } catch (Throwable th) {
            byteArrayInputStream.close();
            throw th;
        }
    }

    public static byte[] f(int i, int i2, dg2 dg2Var) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) dg2Var.g(i2);
        }
        return bArr;
    }

    public static int[] m() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = r(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = r(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] n() {
        int[] iArr = new int[FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = r(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = r(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = r(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = r(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = r(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int r(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void x(byte[] r21, int[] r22, int r23, int r24, int r25, android.graphics.Paint r26, android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi6.x(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static ai6 y(dg2 dg2Var, int i) {
        int iG;
        int i2;
        int iG2;
        int iG3;
        int iG4;
        int i3 = 8;
        int iG5 = dg2Var.g(8);
        dg2Var.o(8);
        int i4 = 2;
        int i5 = i - 2;
        int i6 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrM = m();
        int[] iArrN = n();
        while (i5 > 0) {
            int iG6 = dg2Var.g(i3);
            int iG7 = dg2Var.g(i3);
            int[] iArr2 = (iG7 & FreeTypeConstants.FT_LOAD_PEDANTIC) != 0 ? iArr : (iG7 & 64) != 0 ? iArrM : iArrN;
            if ((iG7 & 1) != 0) {
                iG3 = dg2Var.g(i3);
                iG4 = dg2Var.g(i3);
                iG = dg2Var.g(i3);
                iG2 = dg2Var.g(i3);
                i2 = i5 - 6;
            } else {
                int iG8 = dg2Var.g(6) << i4;
                int iG9 = dg2Var.g(4) << 4;
                iG = dg2Var.g(4) << 4;
                i2 = i5 - 4;
                iG2 = dg2Var.g(i4) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i6;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr2[iG6] = r((byte) (255 - (iG2 & 255)), tpi.g((int) ((1.402d * d2) + d), 0, 255), tpi.g((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), tpi.g((int) ((d3 * 1.772d) + d), 0, 255));
            i5 = i2;
            i6 = 0;
            iG5 = iG5;
            iArrN = iArrN;
            i3 = 8;
            i4 = 2;
        }
        return new ai6(iG5, iArr, iArrM, iArrN);
    }

    public Object B(String str, xzg xzgVar) {
        List<ModelSelectorEntry> listP = p();
        if (!(listP instanceof Collection) || !listP.isEmpty()) {
            for (ModelSelectorEntry modelSelectorEntry : listP) {
                if (ModelId.m1061equalsimpl0(modelSelectorEntry.m364getIdi4oh0I(), str) && modelSelectorEntry.isSelectable()) {
                    return gb9.c0(b6c.F, new ed3(this, str, null, 4), xzgVar);
                }
            }
        }
        return Boolean.FALSE;
    }

    public ro6 D(byte[] bArr) {
        try {
            this.I = new u20().c((String) this.H);
            try {
                return new ro6(7, (aq9) ((dq9) xv8.x(new ive(12, new ByteArrayInputStream(bArr)), (bh) this.I).F).v());
            } catch (IOException | GeneralSecurityException e) {
                try {
                    return C(bArr);
                } catch (IOException unused) {
                    throw e;
                }
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            try {
                ro6 ro6VarC = C(bArr);
                Object obj = ive.I;
                Log.w("ive", "cannot use Android Keystore, it'll be disabled", e2);
                return ro6VarC;
            } catch (IOException unused2) {
                throw e2;
            }
        }
    }

    public bh E() throws KeyStoreException {
        Object obj = ive.I;
        u20 u20Var = new u20();
        try {
            boolean zA = u20.a((String) this.H);
            try {
                return u20Var.c((String) this.H);
            } catch (GeneralSecurityException | ProviderException e) {
                if (!zA) {
                    throw new KeyStoreException(ij0.j("the master key ", (String) this.H, " exists but is unusable"), e);
                }
                Object obj2 = ive.I;
                Log.w("ive", "cannot use Android Keystore, it'll be disabled", e);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e2) {
            Object obj3 = ive.I;
            Log.w("ive", "cannot use Android Keystore, it'll be disabled", e2);
            return null;
        }
    }

    public void F(bne bneVar) {
        if (((AtomicBoolean) this.I).compareAndSet(false, true)) {
            y86 y86Var = (y86) this.K;
            if (y86Var != null) {
                y86Var.a();
            }
            ((hl8) this.F).a((HealthMetricAction) this.E, bneVar, (String) this.G, (String) this.H, Long.valueOf(uh6.f(dqh.a(((dqh) this.J).E))));
        }
    }

    public void G(l81 l81Var) {
        this.G = l81Var;
    }

    public void H(Integer num) {
        this.F = num;
    }

    public void I(long j) {
        this.E = Long.valueOf(j);
    }

    public void J(long j) {
        this.G = Long.valueOf(j);
    }

    public void K(ArrayList arrayList) {
        this.J = arrayList;
    }

    public void L(x81 x81Var) {
        this.K = x81Var;
    }

    public void M() {
        this.K = ozd.E;
    }

    public void N(long j) {
        this.E = Long.valueOf(j);
    }

    public void O(long j) {
        this.F = Long.valueOf(j);
    }

    public void P(int i) {
        this.H = Integer.valueOf(i);
    }

    public void Q(String str) {
        this.I = str;
    }

    public void R(byte[] bArr) {
        this.H = bArr;
    }

    public void S(String str) {
        this.I = str;
    }

    public void T(long j) {
        this.J = Long.valueOf(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x0276  */
    @Override // defpackage.dxg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(byte[] r44, int r45, int r46, defpackage.cxg r47, defpackage.gm4 r48) {
        /*
            Method dump skipped, instruction units count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hi6.b(byte[], int, int, cxg, gm4):void");
    }

    public u81 c() {
        String strConcat = ((Long) this.E) == null ? " eventTimeMs" : "";
        if (((Long) this.G) == null) {
            strConcat = strConcat.concat(" eventUptimeMs");
        }
        if (((Long) this.J) == null) {
            strConcat = strConcat.concat(" timezoneOffsetSeconds");
        }
        if (strConcat.isEmpty()) {
            return new u81(((Long) this.E).longValue(), (Integer) this.F, ((Long) this.G).longValue(), (byte[]) this.H, (String) this.I, ((Long) this.J).longValue(), (x81) this.K);
        }
        sz6.j("Missing required properties:".concat(strConcat));
        return null;
    }

    public v81 d() {
        String strConcat = ((Long) this.E) == null ? " requestTimeMs" : "";
        if (((Long) this.F) == null) {
            strConcat = strConcat.concat(" requestUptimeMs");
        }
        if (strConcat.isEmpty()) {
            return new v81(((Long) this.E).longValue(), ((Long) this.F).longValue(), (l81) this.G, (Integer) this.H, (String) this.I, (ArrayList) this.J, (ozd) this.K);
        }
        sz6.j("Missing required properties:".concat(strConcat));
        return null;
    }

    public synchronized ive e() {
        ive iveVar;
        try {
            if (((String) this.F) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (ive.I) {
                try {
                    Context context = (Context) this.E;
                    String str = (String) this.F;
                    String str2 = (String) this.G;
                    byte[] bArrI = null;
                    if (str != null) {
                        Context applicationContext = context.getApplicationContext();
                        try {
                            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                            if (string != null) {
                                bArrI = psk.i(string);
                            }
                        } catch (ClassCastException | IllegalArgumentException unused) {
                            throw new CharConversionException(ij0.j("can't read keyset; the pref value ", str, " is not a valid hex string"));
                        }
                    } else {
                        sz6.p("keysetName cannot be null");
                    }
                    String str3 = (String) this.H;
                    if (bArrI == null) {
                        if (str3 != null) {
                            this.I = E();
                        }
                        this.K = o();
                    } else if (str3 != null) {
                        this.K = D(bArrI);
                    } else {
                        this.K = C(bArrI);
                    }
                    iveVar = new ive(this);
                } finally {
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return iveVar;
    }

    public void g() {
        qo0 qo0Var = (qo0) this.H;
        hw4 hw4Var = (hw4) this.K;
        for (Object obj : hw4Var.values()) {
            obj.getClass();
            WebView webView = ((iw4) obj).a;
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
            webView.destroy();
        }
        hw4Var.clear();
        Iterator<E> it = qo0Var.iterator();
        while (it.hasNext()) {
            ((m9d) it.next()).a.destroy();
        }
        qo0Var.clear();
        ((HashMap) this.I).clear();
        ((HashMap) this.J).clear();
        ((HashMap) this.G).clear();
        ((HashSet) this.F).clear();
    }

    public ModelSelectorEntry h(String str) {
        ModelSelectorEntry modelSelectorEntry;
        Iterator it = ((pkc) this.E).a().c().iterator();
        do {
            modelSelectorEntry = null;
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Iterator<T> it2 = ((ModelSelectorConfig) it.next()).getModels().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (ModelId.m1061equalsimpl0(((ModelSelectorEntry) next).m364getIdi4oh0I(), str)) {
                    obj = next;
                    break;
                }
            }
            modelSelectorEntry = (ModelSelectorEntry) obj;
        } while (modelSelectorEntry == null);
        return modelSelectorEntry;
    }

    public String i(String str) throws IOException {
        String upperCase;
        ptc ptcVar;
        String displayName;
        String strM1059constructorimpl = ModelId.m1059constructorimpl(str);
        ModelSelectorEntry modelSelectorEntryH = h(strM1059constructorimpl);
        if (modelSelectorEntryH != null && (displayName = modelSelectorEntryH.getDisplayName()) != null) {
            return displayName;
        }
        ModelSelectorEntry modelSelectorEntryH2 = h(j.b(strM1059constructorimpl));
        if (modelSelectorEntryH2 != null) {
            return modelSelectorEntryH2.getDisplayName();
        }
        String strM1059constructorimpl2 = ModelId.m1059constructorimpl(str);
        String strA = j.a(strM1059constructorimpl2);
        String string = null;
        if (strA != null) {
            upperCase = strA.toUpperCase(Locale.ROOT);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        String strB = j.b(strM1059constructorimpl2);
        ova ovaVarB = j.b.b(strB);
        if (ovaVarB != null) {
            String string2 = (String) ((mva) ovaVarB.a()).get(1);
            String strC = (String) ((mva) ovaVarB.a()).get(2);
            String str2 = (String) ((mva) ovaVarB.a()).get(3);
            String str3 = (String) ((mva) ovaVarB.a()).get(4);
            if (string2.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(string2.charAt(0));
                strValueOf.getClass();
                String upperCase2 = strValueOf.toUpperCase(Locale.ROOT);
                upperCase2.getClass();
                sb.append((Object) upperCase2);
                sb.append(string2.substring(1));
                string2 = sb.toString();
            }
            if (str2.length() > 0) {
                strC = ij0.C(strC, ".", str2);
            }
            ptcVar = new ptc(ij0.k("Claude ", string2, " ", strC), str3.length() > 0 ? "Fast" : null, upperCase);
        } else {
            ova ovaVarB2 = j.c.b(strB);
            if (ovaVarB2 != null) {
                String str4 = (String) ((mva) ovaVarB2.a()).get(1);
                String str5 = (String) ((mva) ovaVarB2.a()).get(2);
                List listX0 = bsg.X0((String) ((mva) ovaVarB2.a()).get(3), new char[]{'-'}, 6);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listX0) {
                    String str6 = (String) obj;
                    if (str6.length() > 0 && !str6.equals("prod")) {
                        arrayList.add(obj);
                    }
                }
                String strS0 = w44.S0(arrayList, " ", null, null, new i04(9), 30);
                if (strS0.length() == 0) {
                    strS0 = null;
                }
                ptcVar = new ptc(ij0.C(j.d(str4), " ", str5), strS0, upperCase);
            } else {
                ova ovaVarB3 = j.d.b(strB);
                if (ovaVarB3 != null) {
                    String string3 = (String) ((mva) ovaVarB3.a()).get(1);
                    List listX02 = bsg.X0((String) ((mva) ovaVarB3.a()).get(2), new char[]{'-'}, 6);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listX02) {
                        String str7 = (String) obj2;
                        if (str7.length() > 0 && !str7.equals("prod")) {
                            arrayList2.add(obj2);
                        }
                    }
                    String strS02 = w44.S0(w44.b1(arrayList2, "latest"), " ", null, null, new i04(10), 30);
                    if (j.e.contains(string3)) {
                        if (string3.length() > 0) {
                            StringBuilder sb2 = new StringBuilder();
                            String strValueOf2 = String.valueOf(string3.charAt(0));
                            strValueOf2.getClass();
                            String upperCase3 = strValueOf2.toUpperCase(Locale.ROOT);
                            upperCase3.getClass();
                            sb2.append((Object) upperCase3);
                            sb2.append(string3.substring(1));
                            string3 = sb2.toString();
                        }
                        ptcVar = new ptc("Claude ".concat(string3), strS02, upperCase);
                    } else {
                        ptcVar = new ptc(j.d(string3), strS02, upperCase);
                    }
                } else {
                    ptcVar = null;
                }
            }
        }
        if (ptcVar != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ptcVar.a);
            String str8 = ptcVar.b;
            if (str8 != null) {
                sb3.append(' ');
                sb3.append(str8);
            }
            String str9 = ptcVar.c;
            if (str9 != null) {
                sb3.append(" (");
                sb3.append(str9);
                sb3.append(')');
            }
            string = sb3.toString();
        }
        return string == null ? str : string;
    }

    @Override // defpackage.sr9, defpackage.tr9
    public void j() {
        rl rlVar = (rl) this.G;
        gh3 gh3Var = (gh3) this.I;
        HashMap map = (HashMap) this.F;
        map.getClass();
        boolean zG = false;
        if (gh3Var.equals(xgg.b)) {
            Object obj = map.get(sxb.e(ExperienceToggle.DEFAULT_PARAM_KEY));
            bm9 bm9Var = obj instanceof bm9 ? (bm9) obj : null;
            if (bm9Var != null) {
                Object obj2 = bm9Var.a;
                zl9 zl9Var = obj2 instanceof zl9 ? (zl9) obj2 : null;
                if (zl9Var != null) {
                    zG = rlVar.G(zl9Var.a.a);
                }
            }
        }
        if (zG || rlVar.G(gh3Var)) {
            return;
        }
        ((List) this.J).add(new kc0(((qqb) this.H).W(), map, (neg) this.K));
    }

    @Override // defpackage.sr9
    public void k(sxb sxbVar, Object obj) {
        Object objY0 = pyk.y0((uqb) ((rl) this.E).H, obj);
        if (objY0 == null) {
            objY0 = ajk.f("Unsupported annotation argument: " + sxbVar);
        }
        ((HashMap) this.F).put(sxbVar, objY0);
    }

    public ModelSelectorEntry l(String str) {
        Object next;
        str.getClass();
        Iterator it = p().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (ModelId.m1061equalsimpl0(((ModelSelectorEntry) next).m364getIdi4oh0I(), str)) {
                break;
            }
        }
        return (ModelSelectorEntry) next;
    }

    public ro6 o() throws GeneralSecurityException, IOException {
        if (((gp9) this.J) == null) {
            rl7.j("cannot read or generate keyset");
            return null;
        }
        ro6 ro6Var = new ro6(7, dq9.C());
        gp9 gp9Var = (gp9) this.J;
        synchronized (ro6Var) {
            ro6Var.x(gp9Var.a);
        }
        int iA = qpi.a((dq9) ro6Var.H().F).y().A();
        synchronized (ro6Var) {
            for (int i = 0; i < ((dq9) ((aq9) ro6Var.F).F).z(); i++) {
                try {
                    cq9 cq9VarY = ((dq9) ((aq9) ro6Var.F).F).y(i);
                    if (cq9VarY.B() == iA) {
                        if (!cq9VarY.D().equals(dp9.ENABLED)) {
                            throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + iA);
                        }
                        aq9 aq9Var = (aq9) ro6Var.F;
                        aq9Var.f();
                        dq9.w((dq9) aq9Var.F, iA);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new GeneralSecurityException("key not found: " + iA);
        }
        Context context = (Context) this.E;
        String str = (String) this.F;
        String str2 = (String) this.G;
        if (str == null) {
            sz6.p("keysetName cannot be null");
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        SharedPreferences.Editor editorEdit = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext).edit() : applicationContext.getSharedPreferences(str2, 0).edit();
        if (((bh) this.I) != null) {
            xv8 xv8VarH = ro6Var.H();
            bh bhVar = (bh) this.I;
            byte[] bArr = new byte[0];
            dq9 dq9Var = (dq9) xv8VarH.F;
            byte[] bArrA = bhVar.a(dq9Var.e(), bArr);
            try {
                if (!dq9.E(bhVar.b(bArrA, bArr), mc7.a()).equals(dq9Var)) {
                    throw new GeneralSecurityException("cannot encrypt keyset");
                }
                gn6 gn6VarZ = hn6.z();
                g22 g22VarE = k22.e(bArrA, 0, bArrA.length);
                gn6VarZ.f();
                hn6.w((hn6) gn6VarZ.F, g22VarE);
                iq9 iq9VarA = qpi.a(dq9Var);
                gn6VarZ.f();
                hn6.x((hn6) gn6VarZ.F, iq9VarA);
                if (!editorEdit.putString(str, psk.j(((hn6) gn6VarZ.b()).e())).commit()) {
                    xh6.c("Failed to write to SharedPreferences");
                    return null;
                }
            } catch (InvalidProtocolBufferException unused) {
                rl7.j("invalid keyset, corrupted key material");
                return null;
            }
        } else if (!editorEdit.putString(str, psk.j(((dq9) ro6Var.H().F).e())).commit()) {
            xh6.c("Failed to write to SharedPreferences");
            return null;
        }
        return ro6Var;
    }

    public List p() {
        return (List) ((wz5) this.H).getValue();
    }

    @Override // defpackage.sr9
    public void q(sxb sxbVar, jh3 jh3Var) {
        ((HashMap) this.F).put(sxbVar, new bm9(new zl9(jh3Var)));
    }

    @Override // defpackage.dxg
    public void reset() {
        gi6 gi6Var = (gi6) this.J;
        gi6Var.c.clear();
        gi6Var.d.clear();
        gi6Var.e.clear();
        gi6Var.f.clear();
        gi6Var.g.clear();
        gi6Var.h = null;
        gi6Var.i = null;
    }

    public String s() {
        ModelId modelId = (ModelId) ((wz5) this.K).getValue();
        if (modelId != null) {
            return modelId.m1064unboximpl();
        }
        return null;
    }

    @Override // defpackage.sr9
    public tr9 t(sxb sxbVar) {
        return new c61((rl) this.E, sxbVar, this);
    }

    @Override // defpackage.sr9
    public void u(sxb sxbVar, gh3 gh3Var, sxb sxbVar2) {
        ((HashMap) this.F).put(sxbVar, new mq6(gh3Var, sxbVar2));
    }

    public String v() {
        ModelSelectorEntry modelSelectorEntryL;
        String strS = s();
        if (strS == null || (modelSelectorEntryL = l(strS)) == null) {
            return null;
        }
        return modelSelectorEntryL.getDisplayName();
    }

    public boolean w() {
        List listP = p();
        if ((listP instanceof Collection) && listP.isEmpty()) {
            return false;
        }
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            if (((ModelSelectorEntry) it.next()).isSelectable()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sr9
    public sr9 z(gh3 gh3Var, sxb sxbVar) {
        ArrayList arrayList = new ArrayList();
        hi6 hi6VarH = ((rl) this.E).H(gh3Var, neg.n, arrayList);
        h80 h80Var = new h80();
        h80Var.F = hi6VarH;
        h80Var.G = this;
        h80Var.H = sxbVar;
        h80Var.I = arrayList;
        h80Var.E = hi6VarH;
        return h80Var;
    }

    public /* synthetic */ hi6(byte b) {
    }

    public hi6(HealthMetricAction healthMetricAction, hl8 hl8Var, l45 l45Var, String str, String str2) {
        healthMetricAction.getClass();
        l45Var.getClass();
        this.E = healthMetricAction;
        this.F = hl8Var;
        this.G = str;
        this.H = str2;
        this.I = new AtomicBoolean(false);
        this.J = new dqh(brb.a());
        this.K = knk.z(l45Var.getCoroutineContext()).D0(new py3(29, this));
    }

    public hi6(rl rlVar, qqb qqbVar, gh3 gh3Var, List list, neg negVar) {
        this.G = rlVar;
        this.H = qqbVar;
        this.I = gh3Var;
        this.J = list;
        this.K = negVar;
        this.E = rlVar;
        this.F = new HashMap();
    }

    public hi6(int i) {
        switch (i) {
            case 6:
                this.E = new Handler(Looper.getMainLooper());
                this.F = new HashSet();
                this.G = new HashMap();
                this.H = new qo0();
                this.I = new HashMap();
                this.J = new HashMap();
                this.K = new hw4(this, 9);
                break;
            default:
                this.E = null;
                this.F = null;
                this.G = null;
                this.H = null;
                this.I = null;
                this.J = null;
                break;
        }
    }
}
