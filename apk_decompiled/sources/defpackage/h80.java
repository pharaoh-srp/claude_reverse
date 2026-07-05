package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.print.PrintDocumentAdapter;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.sessions.types.CodeAgent;
import com.anthropic.claude.types.strings.CodeAgentId;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.TemporalAmount;
import java.time.zone.ZoneRules;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public final class h80 implements sr9, ns, xwg {
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;

    public h80(aqh aqhVar, Duration duration, bz7 bz7Var) {
        h69 h69Var;
        duration.getClass();
        this.E = aqhVar;
        this.F = duration;
        this.G = bz7Var;
        if (aqhVar instanceof h69) {
            h69Var = (h69) aqhVar;
        } else {
            if (!(aqhVar instanceof cea)) {
                wg6.i();
                throw null;
            }
            cea ceaVar = (cea) aqhVar;
            Instant instant = ceaVar.a.toInstant(ZoneOffset.MAX);
            instant.getClass();
            Instant instant2 = ceaVar.b.toInstant(ZoneOffset.MIN);
            instant2.getClass();
            h69Var = new h69(instant, instant2);
        }
        this.H = h69Var;
        this.I = new LinkedHashMap();
    }

    public void a(l12 l12Var, Class cls) {
        ((ArrayList) this.F).add(new cpc(l12Var, cls));
    }

    public void b(gh7 gh7Var, Class cls) {
        ((ArrayList) this.H).add(new cpc(gh7Var, cls));
    }

    public CodeAgent c(String str) {
        Object next;
        str.getClass();
        Iterator it = ((List) ((lsc) this.F).getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (CodeAgentId.m995equalsimpl0(((CodeAgent) next).m833getIdVN9v2L4(), str)) {
                break;
            }
        }
        return (CodeAgent) next;
    }

    @Override // defpackage.xwg
    public int d(long j) {
        long[] jArr = (long[]) this.F;
        int iA = tpi.a(jArr, j, false);
        if (iA < jArr.length) {
            return iA;
        }
        return -1;
    }

    public void e(CharSequence charSequence) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.I;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
        } catch (Throwable unused) {
        }
        this.I = null;
        try {
            ((PrintDocumentAdapter) this.E).onFinish();
        } catch (Throwable unused2) {
        }
        ((jo3) this.H).invoke(charSequence);
    }

    @Override // defpackage.ns
    public void f(y7e y7eVar) {
        Instant instantH;
        Instant instantH2;
        Duration duration = (Duration) this.F;
        h69 h69Var = (h69) this.H;
        y7eVar.getClass();
        if (vok.k(y7eVar, (aqh) this.E)) {
            Instant instantPlus = h69Var.a;
            boolean z = y7eVar instanceof i69;
            if (z) {
                instantH = h(((i69) y7eVar).a());
            } else {
                if (!(y7eVar instanceof sa9)) {
                    xh6.d("Unsupported value for aggregation: ", y7eVar);
                    return;
                }
                instantH = h(((sa9) y7eVar).b());
            }
            if (instantPlus.compareTo(instantH) < 0) {
                instantPlus = instantH;
            }
            if (z) {
                instantH2 = instantPlus;
            } else {
                if (!(y7eVar instanceof sa9)) {
                    xh6.d("Unsupported value for aggregation: ", y7eVar);
                    return;
                }
                instantH2 = h(((sa9) y7eVar).e());
            }
            while (instantPlus.compareTo(instantH2) <= 0 && instantPlus.compareTo(h69Var.b) < 0) {
                Instant instantPlus2 = instantPlus.plus((TemporalAmount) duration);
                instantPlus2.getClass();
                h69 h69Var2 = new h69(instantPlus, (Instant) nai.V(instantPlus2, h69Var.b));
                if (vok.k(y7eVar, h69Var2)) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.I;
                    Object gsVar = linkedHashMap.get(instantPlus);
                    if (gsVar == null) {
                        gsVar = new gs((fs) ((bz7) this.G).invoke(h69Var2), instantPlus);
                        linkedHashMap.put(instantPlus, gsVar);
                    }
                    ((gs) gsVar).b(y7eVar);
                }
                instantPlus = instantPlus.plus((TemporalAmount) duration);
                instantPlus.getClass();
            }
        }
    }

    @Override // defpackage.xwg
    public long g(int i) {
        return ((long[]) this.F)[i];
    }

    @Override // defpackage.ns
    public Object getResult() {
        Collection<gs> collectionValues = ((LinkedHashMap) this.I).values();
        ArrayList arrayList = new ArrayList(x44.y(collectionValues, 10));
        for (gs gsVar : collectionValues) {
            Instant instant = gsVar.b;
            Instant instantPlus = instant.plus((TemporalAmount) this.F);
            instantPlus.getClass();
            Instant instant2 = (Instant) nai.V(instantPlus, ((h69) this.H).b);
            ZoneOffset offset = gsVar.c;
            if (offset == null) {
                ZoneRules rules = ZoneId.systemDefault().getRules();
                Instant instantNow = gsVar.d;
                if (instantNow == null) {
                    instantNow = Instant.now();
                }
                offset = rules.getOffset(instantNow);
            }
            ZoneOffset zoneOffset = offset;
            hs hsVarA = gsVar.a.a();
            zoneOffset.getClass();
            is isVar = new is(hsVarA, instant, instant2, zoneOffset, false);
            Instant instant3 = gsVar.d;
            if (instant3 == null) {
                instant3 = Instant.MAX;
            }
            instant3.getClass();
            arrayList.add(new js(isVar, instant3));
        }
        return arrayList;
    }

    public Instant h(Instant instant) {
        Instant instant2 = ((h69) this.H).a;
        Duration duration = (Duration) this.F;
        Instant instantPlus = instant2.plus((TemporalAmount) duration.multipliedBy(Duration.between(instant2, instant).dividedBy(duration)));
        instantPlus.getClass();
        return instantPlus;
    }

    @Override // defpackage.xwg
    public List i(long j) {
        s8i s8iVar = (s8i) this.E;
        Map map = (Map) this.G;
        HashMap map2 = (HashMap) this.H;
        HashMap map3 = (HashMap) this.I;
        ArrayList<Pair> arrayList = new ArrayList();
        s8iVar.g(j, s8iVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        s8iVar.i(j, false, s8iVar.h, treeMap);
        s8iVar.h(j, map, map2, s8iVar.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                v8i v8iVar = (v8i) map2.get(pair.first);
                v8iVar.getClass();
                arrayList2.add(new dd5(null, null, null, bitmapDecodeByteArray, v8iVar.c, 0, v8iVar.e, v8iVar.b, 0, Integer.MIN_VALUE, -3.4028235E38f, v8iVar.f, v8iVar.g, false, -16777216, v8iVar.j, MTTypesetterKt.kLineSkipLimitMultiplier, 0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            v8i v8iVar2 = (v8i) map2.get(entry.getKey());
            v8iVar2.getClass();
            cd5 cd5Var = (cd5) entry.getValue();
            CharSequence charSequence = cd5Var.a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (uy5 uy5Var : (uy5[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), uy5.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(uy5Var), spannableStringBuilder.getSpanEnd(uy5Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = v8iVar2.c;
            int i9 = v8iVar2.d;
            cd5Var.e = f;
            cd5Var.f = i9;
            cd5Var.g = v8iVar2.e;
            cd5Var.h = v8iVar2.b;
            cd5Var.l = v8iVar2.f;
            float f2 = v8iVar2.i;
            int i10 = v8iVar2.h;
            cd5Var.k = f2;
            cd5Var.j = i10;
            cd5Var.p = v8iVar2.j;
            arrayList2.add(cd5Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.sr9, defpackage.tr9
    public void j() {
        ((hi6) this.F).j();
        hi6 hi6Var = (hi6) this.G;
        ((HashMap) hi6Var.F).put((sxb) this.H, new uc0((jc0) w44.e1((ArrayList) this.I)));
    }

    @Override // defpackage.sr9
    public void k(sxb sxbVar, Object obj) {
        ((hi6) this.E).k(sxbVar, obj);
    }

    @Override // defpackage.xwg
    public int l() {
        return ((long[]) this.F).length;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(defpackage.vp4 r9) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.m(vp4):java.lang.Object");
    }

    public void n(String str, Object obj) {
        str.getClass();
        ((LinkedHashMap) this.E).put(str, obj);
        amg amgVar = (amg) ((LinkedHashMap) this.G).get(str);
        if (amgVar != null) {
            amgVar.m(obj);
        }
        amg amgVar2 = (amg) ((LinkedHashMap) this.H).get(str);
        if (amgVar2 != null) {
            amgVar2.m(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.c79 o(float r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.F
            rv1 r0 = (defpackage.rv1) r0
            r1 = 0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 != 0) goto Le
            c79 r10 = r0.a()
            goto L7d
        Le:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            java.lang.Object r2 = r9.G
            rv1 r2 = (defpackage.rv1) r2
            if (r1 != 0) goto L1d
            c79 r10 = r2.a()
            goto L7d
        L1d:
            boolean r1 = r0.b()
            if (r1 == 0) goto L66
            boolean r1 = r2.b()
            if (r1 != 0) goto L2a
            goto L66
        L2a:
            java.lang.Object r1 = r9.I
            a5h r1 = (defpackage.a5h) r1
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r1.d
            c79 r3 = r0.a()
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 == 0) goto L4f
            java.lang.Object r1 = r9.I
            a5h r1 = (defpackage.a5h) r1
            r1.getClass()
            java.lang.Object r1 = r1.c
            c79 r3 = r2.a()
            boolean r1 = defpackage.x44.r(r1, r3)
            if (r1 != 0) goto L66
        L4f:
            a5h r3 = new a5h
            java.lang.Object r1 = r9.E
            r4 = r1
            kl7 r4 = (defpackage.kl7) r4
            d9i r5 = defpackage.x44.b
            c79 r6 = r0.a()
            c79 r7 = r2.a()
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            r9.I = r3
        L66:
            java.lang.Object r0 = r9.I
            a5h r0 = (defpackage.a5h) r0
            if (r0 == 0) goto L7b
            long r1 = r0.b()
            float r1 = (float) r1
            float r1 = r1 * r10
            long r1 = (long) r1
            java.lang.Object r10 = r0.f(r1)
            c79 r10 = (defpackage.c79) r10
            if (r10 != 0) goto L7d
        L7b:
            c79 r10 = defpackage.sf5.a
        L7d:
            r9.H = r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h80.o(float):c79");
    }

    @Override // defpackage.sr9
    public void q(sxb sxbVar, jh3 jh3Var) {
        ((hi6) this.E).q(sxbVar, jh3Var);
    }

    @Override // defpackage.sr9
    public tr9 t(sxb sxbVar) {
        return ((hi6) this.E).t(sxbVar);
    }

    @Override // defpackage.sr9
    public void u(sxb sxbVar, gh3 gh3Var, sxb sxbVar2) {
        ((hi6) this.E).u(sxbVar, gh3Var, sxbVar2);
    }

    @Override // defpackage.sr9
    public sr9 z(gh3 gh3Var, sxb sxbVar) {
        return ((hi6) this.E).z(gh3Var, sxbVar);
    }

    public h80(s8i s8iVar, HashMap map, HashMap map2, HashMap map3) {
        this.E = s8iVar;
        this.H = map2;
        this.I = map3;
        this.G = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        s8iVar.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.F = jArr;
    }

    public h80(Map map) {
        map.getClass();
        this.E = new LinkedHashMap(map);
        this.F = new LinkedHashMap();
        this.G = new LinkedHashMap();
        this.H = new LinkedHashMap();
        this.I = new m5f(this);
    }
}
