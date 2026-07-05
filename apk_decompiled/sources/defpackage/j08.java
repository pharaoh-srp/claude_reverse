package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.api.login.VerifyResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.a;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class j08 extends eo5 implements h08 {
    public List I;
    public List J;
    public yr9 K;
    public List L;
    public l6e M;
    public l6e N;
    public int O;
    public ow5 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public Collection b0;
    public volatile p4 c0;
    public final h08 d0;
    public final int e0;
    public h08 f0;
    public Map g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j08(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar) {
        super(bo5Var, wc0Var, sxbVar, negVar);
        if (bo5Var == null) {
            k0(0);
            throw null;
        }
        if (wc0Var == null) {
            k0(1);
            throw null;
        }
        if (sxbVar == null) {
            k0(2);
            throw null;
        }
        if (i == 0) {
            k0(3);
            throw null;
        }
        if (negVar == null) {
            k0(4);
            throw null;
        }
        this.P = q06.i;
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = true;
        this.a0 = false;
        this.b0 = null;
        this.c0 = null;
        this.f0 = null;
        this.g0 = null;
        this.d0 = h08Var == null ? this : h08Var;
        this.e0 = i;
    }

    public static ArrayList R0(h08 h08Var, List list, a aVar, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            k0(30);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eri eriVar = (eri) it.next();
            yr9 yr9VarK = aVar.k(2, eriVar.getType());
            yr9 yr9VarS0 = eriVar.S0();
            yr9 yr9VarK2 = yr9VarS0 == null ? null : aVar.k(2, yr9VarS0);
            if (yr9VarK == null) {
                return null;
            }
            if ((yr9VarK != eriVar.getType() || yr9VarS0 != yr9VarK2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(eri.O0(h08Var, z ? null : eriVar, eriVar.getIndex(), eriVar.getAnnotations(), eriVar.getName(), yr9VarK, eriVar.P0(), eriVar.T0(), eriVar.U0(), yr9VarK2, z2 ? eriVar.d() : neg.n, eriVar instanceof dri ? new o4(7, ((dri) eriVar).V0()) : null));
        }
        return arrayList;
    }

    public static /* synthetic */ void k0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = VerifyResponse.AuthenticationState.DISCRIMINATOR;
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[0] = "overriddenDescriptors";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case g.AVG_FIELD_NUMBER /* 18 */:
                objArr[1] = "getTypeParameters";
                break;
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                objArr[1] = "getValueParameters";
                break;
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case g.MAX_FIELD_NUMBER /* 17 */:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case BuildConfig.VERSION_CODE /* 25 */:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
            case 16:
            case g.AVG_FIELD_NUMBER /* 18 */:
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
            case 21:
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case g.MAX_FIELD_NUMBER /* 17 */:
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
            case 24:
            case BuildConfig.VERSION_CODE /* 25 */:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    @Override // defpackage.h08
    public boolean B() {
        return this.U;
    }

    @Override // defpackage.bo5
    public Object E(fo5 fo5Var, Object obj) {
        return fo5Var.x(this, obj);
    }

    @Override // defpackage.c92
    public final List I() {
        List list = this.J;
        if (list != null) {
            return list;
        }
        k0(19);
        throw null;
    }

    @Override // defpackage.h08
    public final h08 N() {
        return this.f0;
    }

    public final h08 N0(bo5 bo5Var, int i, ow5 ow5Var) {
        h08 h08VarBuild = f0().r(bo5Var).v(i).b(ow5Var).c(2).l().build();
        if (h08VarBuild != null) {
            return h08VarBuild;
        }
        k0(26);
        throw null;
    }

    @Override // defpackage.e92
    /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
    public c7g M(bo5 bo5Var, int i, ow5 ow5Var) {
        return (c7g) N0(bo5Var, i, ow5Var);
    }

    @Override // defpackage.c92
    public final l6e P() {
        return this.N;
    }

    public abstract j08 P0(int i, wc0 wc0Var, bo5 bo5Var, h08 h08Var, sxb sxbVar, neg negVar);

    public j08 Q0(i08 i08Var) {
        char c;
        mw9 mw9Var;
        mw9 mw9Var2;
        yr9 yr9VarK;
        boolean[] zArr = new boolean[1];
        wc0 wc0VarD = i08Var.W != null ? csk.d(getAnnotations(), i08Var.W) : getAnnotations();
        bo5 bo5Var = i08Var.F;
        h08 h08Var = i08Var.I;
        int i = i08Var.J;
        sxb sxbVar = i08Var.P;
        neg negVarD = i08Var.S ? ((eo5) (h08Var != null ? h08Var : a())).d() : neg.n;
        if (negVarD == null) {
            k0(27);
            throw null;
        }
        j08 j08VarP0 = P0(i, wc0VarD, bo5Var, h08Var, sxbVar, negVarD);
        List typeParameters = i08Var.V == null ? getTypeParameters() : i08Var.V;
        zArr[0] = (zArr[0] ? 1 : 0) | (!typeParameters.isEmpty() ? 1 : 0);
        ArrayList arrayList = new ArrayList(typeParameters.size());
        a aVarJ = nv1.j(typeParameters, i08Var.E, j08VarP0, arrayList, zArr);
        if (aVarJ != null) {
            ArrayList arrayList2 = new ArrayList();
            if (!i08Var.L.isEmpty()) {
                Iterator it = i08Var.L.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    mw9 mw9Var3 = (mw9) ((l6e) it.next());
                    yr9 yr9VarK2 = aVarJ.k(2, mw9Var3.getType());
                    if (yr9VarK2 != null) {
                        int i3 = i2 + 1;
                        arrayList2.add(xzk.o(j08VarP0, yr9VarK2, ((uo4) mw9Var3.getValue()).p(), mw9Var3.getAnnotations(), i2));
                        zArr[0] = (zArr[0] ? 1 : 0) | (yr9VarK2 != mw9Var3.getType() ? (char) 1 : (char) 0);
                        i2 = i3;
                    }
                }
            }
            l6e l6eVar = i08Var.M;
            if (l6eVar != null) {
                yr9 yr9VarK3 = aVarJ.k(2, ((mw9) l6eVar).getType());
                if (yr9VarK3 == null) {
                    return null;
                }
                i08Var.M.getValue();
                mw9 mw9Var4 = new mw9(j08VarP0, new dc7(j08VarP0, yr9VarK3), ((rok) i08Var.M).getAnnotations());
                zArr[0] = (yr9VarK3 != ((mw9) i08Var.M).getType() ? (char) 1 : (char) 0) | (zArr[0] ? 1 : 0);
                c = 0;
                mw9Var = mw9Var4;
            } else {
                c = 0;
                mw9Var = null;
            }
            l6e l6eVar2 = i08Var.N;
            if (l6eVar2 != null) {
                mw9 mw9VarO0 = ((mw9) l6eVar2).e(aVarJ);
                if (mw9VarO0 == null) {
                    return null;
                }
                zArr[c] = (zArr[c] ? 1 : 0) | (mw9VarO0 != i08Var.N ? (char) 1 : c);
                mw9Var2 = mw9VarO0;
            } else {
                mw9Var2 = null;
            }
            ArrayList arrayListR0 = R0(j08VarP0, i08Var.K, aVarJ, i08Var.T, i08Var.S, zArr);
            if (arrayListR0 == null || (yr9VarK = aVarJ.k(3, i08Var.O)) == null) {
                return null;
            }
            boolean z = (zArr[c] ? 1 : 0) | (yr9VarK != i08Var.O ? (char) 1 : c);
            zArr[c] = z;
            if (z == 0 && i08Var.a0) {
                return this;
            }
            j08VarP0.S0(mw9Var, mw9Var2, arrayList2, arrayList, arrayListR0, yr9VarK, i08Var.G, i08Var.H);
            j08VarP0.Q = this.Q;
            j08VarP0.R = this.R;
            j08VarP0.S = this.S;
            j08VarP0.T = this.T;
            j08VarP0.U = this.U;
            j08VarP0.Y = this.Y;
            j08VarP0.V = this.V;
            j08VarP0.V0(this.Z);
            j08VarP0.W = i08Var.U;
            j08VarP0.X = i08Var.X;
            j08VarP0.W0(i08Var.Z != null ? i08Var.Z.booleanValue() : this.a0);
            if (!i08Var.Y.isEmpty() || this.g0 != null) {
                LinkedHashMap linkedHashMap = i08Var.Y;
                Map map = this.g0;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!linkedHashMap.containsKey(entry.getKey())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap.size() == 1) {
                    j08VarP0.g0 = Collections.singletonMap(linkedHashMap.keySet().iterator().next(), linkedHashMap.values().iterator().next());
                } else {
                    j08VarP0.g0 = linkedHashMap;
                }
            }
            if (i08Var.R || this.f0 != null) {
                h08 h08Var2 = this.f0;
                if (h08Var2 == null) {
                    h08Var2 = this;
                }
                j08VarP0.f0 = h08Var2.e(aVarJ);
            }
            if (i08Var.Q && !a().i().isEmpty()) {
                if (i08Var.E.f()) {
                    p4 p4Var = this.c0;
                    if (p4Var != null) {
                        j08VarP0.c0 = p4Var;
                        return j08VarP0;
                    }
                    j08VarP0.d0(i());
                    return j08VarP0;
                }
                j08VarP0.c0 = new p4(this, aVarJ, 20);
            }
            return j08VarP0;
        }
        return null;
    }

    @Override // defpackage.c92
    public final l6e S() {
        return this.M;
    }

    public void S0(l6e l6eVar, l6e l6eVar2, List list, List list2, List list3, yr9 yr9Var, int i, ow5 ow5Var) {
        if (list == null) {
            k0(5);
            throw null;
        }
        if (list2 == null) {
            k0(6);
            throw null;
        }
        if (list3 == null) {
            k0(7);
            throw null;
        }
        if (ow5Var == null) {
            k0(8);
            throw null;
        }
        this.I = w44.p1(list2);
        this.J = w44.p1(list3);
        this.K = yr9Var;
        this.O = i;
        this.P = ow5Var;
        this.M = l6eVar;
        this.N = l6eVar2;
        this.L = list;
        for (int i2 = 0; i2 < list2.size(); i2++) {
            qai qaiVar = (qai) list2.get(i2);
            if (qaiVar.getIndex() != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append(qaiVar);
                int index = qaiVar.getIndex();
                sb.append(" index is ");
                sb.append(index);
                sb.append(" but position is ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        }
        for (int i3 = 0; i3 < list3.size(); i3++) {
            eri eriVar = (eri) list3.get(i3);
            if (eriVar.getIndex() != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(eriVar);
                int index2 = eriVar.getIndex();
                sb2.append("index is ");
                sb2.append(index2);
                sb2.append(" but position is ");
                sb2.append(i3);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final i08 T0(a aVar) {
        if (aVar != null) {
            return new i08(this, aVar.g(), h(), q(), getVisibility(), getKind(), I(), X(), this.M, getReturnType());
        }
        k0(24);
        throw null;
    }

    public final void U0(e16 e16Var, Object obj) {
        if (this.g0 == null) {
            this.g0 = new LinkedHashMap();
        }
        this.g0.put(e16Var, obj);
    }

    public void V0(boolean z) {
        this.Z = z;
    }

    public void W0(boolean z) {
        this.a0 = z;
    }

    @Override // defpackage.c92
    public final List X() {
        List list = this.L;
        if (list != null) {
            return list;
        }
        k0(13);
        throw null;
    }

    public final void X0(j7g j7gVar) {
        if (j7gVar != null) {
            this.K = j7gVar;
        } else {
            k0(11);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [h08] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // defpackage.eo5, defpackage.co5, defpackage.bo5
    public h08 a() {
        h08 h08Var = this.d0;
        ?? A = this;
        if (h08Var != this) {
            A = h08Var.a();
        }
        if (A != 0) {
            return A;
        }
        k0(20);
        throw null;
    }

    @Override // defpackage.h08
    public final boolean c0() {
        return this.W;
    }

    @Override // defpackage.e92
    public void d0(Collection collection) {
        if (collection == null) {
            k0(17);
            throw null;
        }
        this.b0 = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((h08) it.next()).e0()) {
                this.X = true;
                return;
            }
        }
    }

    @Override // defpackage.vwg
    public h08 e(a aVar) {
        if (aVar == null) {
            k0(22);
            throw null;
        }
        if (aVar.h()) {
            return this;
        }
        i08 i08VarT0 = T0(aVar);
        i08VarT0.y(a());
        i08VarT0.z();
        i08VarT0.x();
        return i08VarT0.build();
    }

    @Override // defpackage.h08
    public final boolean e0() {
        return this.X;
    }

    public g08 f0() {
        return T0(a.b);
    }

    @Override // defpackage.w9b
    public final boolean g0() {
        return false;
    }

    @Override // defpackage.e92
    public final int getKind() {
        int i = this.e0;
        if (i != 0) {
            return i;
        }
        k0(21);
        throw null;
    }

    @Override // defpackage.c92
    public yr9 getReturnType() {
        return this.K;
    }

    @Override // defpackage.c92
    public final List getTypeParameters() {
        List list = this.I;
        if (list != null) {
            return list;
        }
        xh6.m("typeParameters == null for ", this);
        return null;
    }

    @Override // defpackage.go5, defpackage.w9b
    public final ow5 getVisibility() {
        ow5 ow5Var = this.P;
        if (ow5Var != null) {
            return ow5Var;
        }
        k0(16);
        throw null;
    }

    @Override // defpackage.e92, defpackage.c92
    public Collection i() {
        p4 p4Var = this.c0;
        if (p4Var != null) {
            this.b0 = (Collection) p4Var.a();
            this.c0 = null;
        }
        Collection collection = this.b0;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection != null) {
            return collection;
        }
        k0(14);
        throw null;
    }

    @Override // defpackage.w9b
    public boolean isExternal() {
        return this.S;
    }

    @Override // defpackage.h08
    public final boolean isInfix() {
        if (this.R) {
            return true;
        }
        Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((h08) it.next()).isInfix()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h08
    public boolean isInline() {
        return this.T;
    }

    @Override // defpackage.h08
    public final boolean isOperator() {
        if (this.Q) {
            return true;
        }
        Iterator it = a().i().iterator();
        while (it.hasNext()) {
            if (((h08) it.next()).isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h08
    public boolean isSuspend() {
        return this.Y;
    }

    @Override // defpackage.c92
    public Object n(e16 e16Var) {
        Map map = this.g0;
        if (map == null) {
            return null;
        }
        return map.get(e16Var);
    }

    @Override // defpackage.w9b
    public final int q() {
        int i = this.O;
        if (i != 0) {
            return i;
        }
        k0(15);
        throw null;
    }

    public boolean v() {
        return this.a0;
    }

    @Override // defpackage.w9b
    public final boolean x() {
        return this.V;
    }
}
