package defpackage;

import androidx.compose.foundation.layout.b;
import com.agog.mathdisplay.render.MTTypesetterKt;
import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ArrayProperty;
import com.anthropic.claude.api.chat.tool.BooleanProperty;
import com.anthropic.claude.api.chat.tool.InputSchema;
import com.anthropic.claude.api.chat.tool.IntegerProperty;
import com.anthropic.claude.api.chat.tool.NumberProperty;
import com.anthropic.claude.api.chat.tool.ObjectProperty;
import com.anthropic.claude.api.chat.tool.PropertyDefinition;
import com.anthropic.claude.api.chat.tool.StringProperty;
import com.anthropic.claude.api.chat.tool.Tool;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pwh {
    public static final void a(String str, String str2, ld4 ld4Var, int i) {
        String str3;
        e18 e18Var;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-347056170);
        int i2 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(str2) ? 32 : 16);
        if (e18Var2.Q(i2 & 1, (i2 & 19) != 18)) {
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            fqb fqbVar = fqb.E;
            iqb iqbVarE = kxk.E(e18Var2, fqbVar);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, cd4.f, q64VarA);
            d4c.i0(e18Var2, cd4.e, hycVarL);
            d4c.i0(e18Var2, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var2, cd4.h);
            d4c.i0(e18Var2, cd4.d, iqbVarE);
            tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, i2 & 14, 0, 131066);
            kxk.g(e18Var2, b.e(fqbVar, 4.0f));
            str3 = str2;
            tjh.b(str3, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).g, e18Var2, (i2 >> 3) & 14, 0, 131066);
            e18Var = e18Var2;
            e18Var.p(true);
        } else {
            str3 = str2;
            e18Var = e18Var2;
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new ny3(i, 9, str, str3);
        }
    }

    public static final void b(String str, final PropertyDefinition propertyDefinition, boolean z, int i, ld4 ld4Var, int i2, int i3) {
        int i4;
        int i5;
        e18 e18Var;
        int i6;
        long j;
        nwb nwbVar;
        iqb iqbVarC;
        String strJ;
        final int i7;
        Map<String, PropertyDefinition> properties;
        Map<String, PropertyDefinition> properties2;
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(19831082);
        int i8 = (e18Var2.f(str) ? 4 : 2) | i2 | (e18Var2.f(propertyDefinition) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i8 |= e18Var2.g(z) ? FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING : FreeTypeConstants.FT_LOAD_PEDANTIC;
        }
        int i9 = i3 & 8;
        if (i9 != 0) {
            i5 = i8 | 3072;
            i4 = i;
        } else {
            i4 = i;
            i5 = i8 | (e18Var2.d(i4) ? FreeTypeConstants.FT_LOAD_IGNORE_TRANSFORM : FreeTypeConstants.FT_LOAD_NO_RECURSE);
        }
        if (e18Var2.Q(i5 & 1, (i5 & 1171) != 1170)) {
            int i10 = i9 != 0 ? 0 : i4;
            if (i10 == 0) {
                e18Var2.a0(1877806383);
                j = gm3.a(e18Var2).p;
            } else {
                e18Var2.a0(1877807343);
                j = gm3.a(e18Var2).o;
            }
            e18Var2.p(false);
            boolean z2 = !(propertyDefinition instanceof ObjectProperty) ? !(propertyDefinition instanceof ArrayProperty) || ((ArrayProperty) propertyDefinition).getItems() == null : (properties2 = ((ObjectProperty) propertyDefinition).getProperties()) == null || properties2.isEmpty();
            Object objN = e18Var2.N();
            lz1 lz1Var = jd4.a;
            if (objN == lz1Var) {
                objN = mpk.P(Boolean.FALSE);
                e18Var2.k0(objN);
            }
            nwb nwbVar2 = (nwb) objN;
            long j2 = j;
            wlg wlgVarB = n80.b(((Boolean) nwbVar2.getValue()).booleanValue() ? 180.0f : MTTypesetterKt.kLineSkipLimitMultiplier, null, "property_chevron_rotation", e18Var2, 3072, 22);
            fqb fqbVar = fqb.E;
            iqb iqbVarJ = gb9.J(yfd.p(xn5.V(b.c(fqbVar, 1.0f), xve.b(8.0f)), j2, zni.b), 12.0f);
            o5b o5bVarD = dw1.d(lja.G, false);
            int iHashCode = Long.hashCode(e18Var2.T);
            hyc hycVarL = e18Var2.l();
            iqb iqbVarE = kxk.E(e18Var2, iqbVarJ);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            z80 z80Var = cd4.f;
            d4c.i0(e18Var2, z80Var, o5bVarD);
            z80 z80Var2 = cd4.e;
            d4c.i0(e18Var2, z80Var2, hycVarL);
            Integer numValueOf = Integer.valueOf(iHashCode);
            z80 z80Var3 = cd4.g;
            d4c.i0(e18Var2, z80Var3, numValueOf);
            bx bxVar = cd4.h;
            d4c.h0(e18Var2, bxVar);
            z80 z80Var4 = cd4.d;
            d4c.i0(e18Var2, z80Var4, iqbVarE);
            int i11 = i5;
            q64 q64VarA = p64.a(ko0.c, lja.S, e18Var2, 0);
            int i12 = i10;
            int iHashCode2 = Long.hashCode(e18Var2.T);
            hyc hycVarL2 = e18Var2.l();
            iqb iqbVarE2 = kxk.E(e18Var2, fqbVar);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, q64VarA);
            d4c.i0(e18Var2, z80Var2, hycVarL2);
            ij0.t(iHashCode2, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE2);
            wo1 wo1Var = lja.Q;
            if (z2) {
                e18Var2.a0(1699139072);
                iqb iqbVarC2 = b.c(fqbVar, 1.0f);
                Object objN2 = e18Var2.N();
                if (objN2 == lz1Var) {
                    nwbVar = nwbVar2;
                    objN2 = new lxf(25, nwbVar);
                    e18Var2.k0(objN2);
                } else {
                    nwbVar = nwbVar2;
                }
                iqb iqbVarC3 = androidx.compose.foundation.b.c(iqbVarC2, false, null, null, null, (zy7) objN2, 15);
                e18Var2.p(false);
                iqbVarC = iqbVarC3;
            } else {
                nwbVar = nwbVar2;
                e18Var2.a0(1699289205);
                e18Var2.p(false);
                iqbVarC = b.c(fqbVar, 1.0f);
            }
            cxe cxeVarA = axe.a(ko0.a, wo1Var, e18Var2, 48);
            nwb nwbVar3 = nwbVar;
            int iHashCode3 = Long.hashCode(e18Var2.T);
            hyc hycVarL3 = e18Var2.l();
            iqb iqbVarE3 = kxk.E(e18Var2, iqbVarC);
            e18Var2.e0();
            if (e18Var2.S) {
                e18Var2.k(re4Var);
            } else {
                e18Var2.n0();
            }
            d4c.i0(e18Var2, z80Var, cxeVarA);
            d4c.i0(e18Var2, z80Var2, hycVarL3);
            ij0.t(iHashCode3, e18Var2, z80Var3, e18Var2, bxVar);
            d4c.i0(e18Var2, z80Var4, iqbVarE3);
            final int i13 = 0;
            tjh.b(str, null, gm3.a(e18Var2).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).h, e18Var2, i11 & 14, 0, 131066);
            kxk.g(e18Var2, b.t(fqbVar, 8.0f));
            String str2 = "unknown";
            if (propertyDefinition instanceof ArrayProperty) {
                PropertyDefinition items = ((ArrayProperty) propertyDefinition).getItems();
                if (items == null) {
                    str2 = "any";
                } else if (items instanceof BooleanProperty) {
                    str2 = "boolean";
                } else if (items instanceof StringProperty) {
                    str2 = "string";
                } else if (items instanceof NumberProperty) {
                    str2 = "number";
                } else if (items instanceof IntegerProperty) {
                    str2 = "integer";
                } else if (items instanceof ArrayProperty) {
                    str2 = "array";
                } else if (items instanceof ObjectProperty) {
                    str2 = "object";
                }
                strJ = ij0.j("array<", str2, ">");
            } else {
                propertyDefinition.getClass();
                if (propertyDefinition instanceof BooleanProperty) {
                    str2 = "boolean";
                } else if (propertyDefinition instanceof StringProperty) {
                    str2 = "string";
                } else if (propertyDefinition instanceof NumberProperty) {
                    str2 = "number";
                } else if (propertyDefinition instanceof IntegerProperty) {
                    str2 = "integer";
                } else if (propertyDefinition instanceof ArrayProperty) {
                    str2 = "array";
                } else if (propertyDefinition instanceof ObjectProperty) {
                    str2 = "object";
                }
                strJ = str2;
            }
            tjh.b(strJ, null, gm3.a(e18Var2).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var2).e.E).i, e18Var2, 0, 0, 131066);
            e18Var = e18Var2;
            if (z) {
                ij0.r(8.0f, 154381512, e18Var, e18Var, fqbVar);
                tjh.b(d4c.j0(R.string.tool_definition_required_badge, e18Var), null, gm3.a(e18Var).x, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(154704408);
                e18Var.p(false);
            }
            if (z2) {
                e18Var.a0(154761045);
                kxk.g(e18Var, new hw9(1.0f, true));
                e18 e18Var3 = e18Var;
                iv1.b(ud0.B, d4c.j0(((Boolean) nwbVar3.getValue()).booleanValue() ? R.string.tool_definition_collapse : R.string.tool_definition_expand, e18Var), ysk.f(fqbVar, ((Number) wlgVarB.getValue()).floatValue()), ef2.F, gm3.a(e18Var).N, e18Var3, 3072, 0);
                e18Var = e18Var3;
                e18Var.p(false);
            } else {
                e18Var.a0(155317464);
                e18Var.p(false);
            }
            e18Var.p(true);
            String description = propertyDefinition.getDescription();
            if (description == null) {
                e18Var.a0(1700859943);
                e18Var.p(false);
            } else {
                sq6.A(4.0f, 1700859944, e18Var, e18Var, fqbVar);
                e18 e18Var4 = e18Var;
                tjh.b(description, null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var4, 0, 0, 131066);
                e18Var = e18Var4;
                e18Var.p(false);
            }
            boolean z3 = propertyDefinition instanceof ObjectProperty;
            s64 s64Var = s64.a;
            if (!z3 || (properties = ((ObjectProperty) propertyDefinition).getProperties()) == null || properties.isEmpty()) {
                i7 = i12;
                e18Var.a0(1701940852);
                e18Var.p(false);
            } else {
                e18Var.a0(1701225868);
                i7 = i12;
                e18 e18Var5 = e18Var;
                wd6.H(s64Var, ((Boolean) nwbVar3.getValue()).booleanValue(), null, null, null, null, fd9.q0(-1290356453, new rz7() { // from class: owh
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i14 = i13;
                        iei ieiVar = iei.a;
                        int i15 = i7;
                        PropertyDefinition propertyDefinition2 = propertyDefinition;
                        switch (i14) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((ia0) obj).getClass();
                                e18 e18Var6 = (e18) ld4Var2;
                                if (e18Var6.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ho0 ho0Var = new ho0(6.0f, true, new sz6(1));
                                    iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                                    q64 q64VarA2 = p64.a(ho0Var, lja.S, e18Var6, 6);
                                    int iHashCode4 = Long.hashCode(e18Var6.T);
                                    hyc hycVarL4 = e18Var6.l();
                                    iqb iqbVarE4 = kxk.E(e18Var6, iqbVarN);
                                    dd4.e.getClass();
                                    re4 re4Var2 = cd4.b;
                                    e18Var6.e0();
                                    if (e18Var6.S) {
                                        e18Var6.k(re4Var2);
                                    } else {
                                        e18Var6.n0();
                                    }
                                    d4c.i0(e18Var6, cd4.f, q64VarA2);
                                    d4c.i0(e18Var6, cd4.e, hycVarL4);
                                    d4c.i0(e18Var6, cd4.g, Integer.valueOf(iHashCode4));
                                    d4c.h0(e18Var6, cd4.h);
                                    d4c.i0(e18Var6, cd4.d, iqbVarE4);
                                    e18Var6.a0(144492720);
                                    ObjectProperty objectProperty = (ObjectProperty) propertyDefinition2;
                                    Map<String, PropertyDefinition> properties3 = objectProperty.getProperties();
                                    properties3.getClass();
                                    for (Map.Entry<String, PropertyDefinition> entry : properties3.entrySet()) {
                                        String key = entry.getKey();
                                        PropertyDefinition value = entry.getValue();
                                        List<String> required = objectProperty.getRequired();
                                        if (required == null) {
                                            required = lm6.E;
                                        }
                                        pwh.b(key, value, required.contains(key), i15 + 1, e18Var6, 0, 0);
                                    }
                                    e18Var6.p(false);
                                    e18Var6.p(true);
                                } else {
                                    e18Var6.T();
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((ia0) obj).getClass();
                                e18 e18Var7 = (e18) ld4Var3;
                                if (e18Var7.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    iqb iqbVarN2 = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                                    q64 q64VarA3 = p64.a(ko0.c, lja.S, e18Var7, 0);
                                    int iHashCode5 = Long.hashCode(e18Var7.T);
                                    hyc hycVarL5 = e18Var7.l();
                                    iqb iqbVarE5 = kxk.E(e18Var7, iqbVarN2);
                                    dd4.e.getClass();
                                    re4 re4Var3 = cd4.b;
                                    e18Var7.e0();
                                    if (e18Var7.S) {
                                        e18Var7.k(re4Var3);
                                    } else {
                                        e18Var7.n0();
                                    }
                                    d4c.i0(e18Var7, cd4.f, q64VarA3);
                                    d4c.i0(e18Var7, cd4.e, hycVarL5);
                                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode5));
                                    d4c.h0(e18Var7, cd4.h);
                                    d4c.i0(e18Var7, cd4.d, iqbVarE5);
                                    String strJ0 = d4c.j0(R.string.tool_definition_array_items, e18Var7);
                                    PropertyDefinition items2 = ((ArrayProperty) propertyDefinition2).getItems();
                                    items2.getClass();
                                    pwh.b(strJ0, items2, false, i15 + 1, e18Var7, 384, 0);
                                    e18Var7.p(true);
                                } else {
                                    e18Var7.T();
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var), e18Var5, 1572870, 30);
                e18Var = e18Var5;
                e18Var.p(false);
            }
            if (!(propertyDefinition instanceof ArrayProperty) || ((ArrayProperty) propertyDefinition).getItems() == null) {
                e18Var.a0(1702494388);
                e18Var.p(false);
            } else {
                e18Var.a0(1702026381);
                final int i14 = 1;
                e18 e18Var6 = e18Var;
                wd6.H(s64Var, ((Boolean) nwbVar3.getValue()).booleanValue(), null, null, null, null, fd9.q0(-923244348, new rz7() { // from class: owh
                    @Override // defpackage.rz7
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i142 = i14;
                        iei ieiVar = iei.a;
                        int i15 = i7;
                        PropertyDefinition propertyDefinition2 = propertyDefinition;
                        switch (i142) {
                            case 0:
                                ld4 ld4Var2 = (ld4) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((ia0) obj).getClass();
                                e18 e18Var62 = (e18) ld4Var2;
                                if (e18Var62.Q(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    ho0 ho0Var = new ho0(6.0f, true, new sz6(1));
                                    iqb iqbVarN = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                                    q64 q64VarA2 = p64.a(ho0Var, lja.S, e18Var62, 6);
                                    int iHashCode4 = Long.hashCode(e18Var62.T);
                                    hyc hycVarL4 = e18Var62.l();
                                    iqb iqbVarE4 = kxk.E(e18Var62, iqbVarN);
                                    dd4.e.getClass();
                                    re4 re4Var2 = cd4.b;
                                    e18Var62.e0();
                                    if (e18Var62.S) {
                                        e18Var62.k(re4Var2);
                                    } else {
                                        e18Var62.n0();
                                    }
                                    d4c.i0(e18Var62, cd4.f, q64VarA2);
                                    d4c.i0(e18Var62, cd4.e, hycVarL4);
                                    d4c.i0(e18Var62, cd4.g, Integer.valueOf(iHashCode4));
                                    d4c.h0(e18Var62, cd4.h);
                                    d4c.i0(e18Var62, cd4.d, iqbVarE4);
                                    e18Var62.a0(144492720);
                                    ObjectProperty objectProperty = (ObjectProperty) propertyDefinition2;
                                    Map<String, PropertyDefinition> properties3 = objectProperty.getProperties();
                                    properties3.getClass();
                                    for (Map.Entry<String, PropertyDefinition> entry : properties3.entrySet()) {
                                        String key = entry.getKey();
                                        PropertyDefinition value = entry.getValue();
                                        List<String> required = objectProperty.getRequired();
                                        if (required == null) {
                                            required = lm6.E;
                                        }
                                        pwh.b(key, value, required.contains(key), i15 + 1, e18Var62, 0, 0);
                                    }
                                    e18Var62.p(false);
                                    e18Var62.p(true);
                                } else {
                                    e18Var62.T();
                                }
                                break;
                            default:
                                ld4 ld4Var3 = (ld4) obj2;
                                int iIntValue2 = ((Integer) obj3).intValue();
                                ((ia0) obj).getClass();
                                e18 e18Var7 = (e18) ld4Var3;
                                if (e18Var7.Q(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    iqb iqbVarN2 = gb9.N(fqb.E, MTTypesetterKt.kLineSkipLimitMultiplier, 8.0f, MTTypesetterKt.kLineSkipLimitMultiplier, MTTypesetterKt.kLineSkipLimitMultiplier, 13);
                                    q64 q64VarA3 = p64.a(ko0.c, lja.S, e18Var7, 0);
                                    int iHashCode5 = Long.hashCode(e18Var7.T);
                                    hyc hycVarL5 = e18Var7.l();
                                    iqb iqbVarE5 = kxk.E(e18Var7, iqbVarN2);
                                    dd4.e.getClass();
                                    re4 re4Var3 = cd4.b;
                                    e18Var7.e0();
                                    if (e18Var7.S) {
                                        e18Var7.k(re4Var3);
                                    } else {
                                        e18Var7.n0();
                                    }
                                    d4c.i0(e18Var7, cd4.f, q64VarA3);
                                    d4c.i0(e18Var7, cd4.e, hycVarL5);
                                    d4c.i0(e18Var7, cd4.g, Integer.valueOf(iHashCode5));
                                    d4c.h0(e18Var7, cd4.h);
                                    d4c.i0(e18Var7, cd4.d, iqbVarE5);
                                    String strJ0 = d4c.j0(R.string.tool_definition_array_items, e18Var7);
                                    PropertyDefinition items2 = ((ArrayProperty) propertyDefinition2).getItems();
                                    items2.getClass();
                                    pwh.b(strJ0, items2, false, i15 + 1, e18Var7, 384, 0);
                                    e18Var7.p(true);
                                } else {
                                    e18Var7.T();
                                }
                                break;
                        }
                        return ieiVar;
                    }
                }, e18Var), e18Var6, 1572870, 30);
                e18Var = e18Var6;
                e18Var.p(false);
            }
            e18Var.p(true);
            e18Var.p(true);
            i6 = i7;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            i6 = i4;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new r13(str, propertyDefinition, z, i6, i2, i3);
        }
    }

    public static final void c(Tool.CustomTool customTool, ld4 ld4Var, int i) {
        e18 e18Var = (e18) ld4Var;
        e18Var.c0(-1710804530);
        int i2 = (e18Var.f(customTool) ? 4 : 2) | i;
        if (e18Var.Q(i2 & 1, (i2 & 3) != 2)) {
            q64 q64VarA = p64.a(new ho0(12.0f, true, new sz6(1)), lja.S, e18Var, 6);
            int iHashCode = Long.hashCode(e18Var.T);
            hyc hycVarL = e18Var.l();
            iqb iqbVarE = kxk.E(e18Var, fqb.E);
            dd4.e.getClass();
            re4 re4Var = cd4.b;
            e18Var.e0();
            if (e18Var.S) {
                e18Var.k(re4Var);
            } else {
                e18Var.n0();
            }
            d4c.i0(e18Var, cd4.f, q64VarA);
            d4c.i0(e18Var, cd4.e, hycVarL);
            d4c.i0(e18Var, cd4.g, Integer.valueOf(iHashCode));
            d4c.h0(e18Var, cd4.h);
            d4c.i0(e18Var, cd4.d, iqbVarE);
            a(d4c.j0(R.string.tool_definition_label_name, e18Var), customTool.getName(), e18Var, 0);
            a(d4c.j0(R.string.tool_definition_label_description, e18Var), customTool.getDescription(), e18Var, 0);
            tjh.b(d4c.j0(R.string.tool_definition_label_input_schema, e18Var), null, gm3.a(e18Var).M, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).h, e18Var, 0, 0, 131066);
            e18Var = e18Var;
            InputSchema input_schema = customTool.getInput_schema();
            if (input_schema.getProperties().isEmpty()) {
                e18Var.a0(-2126045322);
                tjh.b(d4c.j0(R.string.tool_definition_no_properties, e18Var), null, gm3.a(e18Var).N, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((jm3) gm3.c(e18Var).e.E).i, e18Var, 0, 0, 131066);
                e18Var = e18Var;
                e18Var.p(false);
            } else {
                e18Var.a0(-2125817503);
                for (Map.Entry<String, PropertyDefinition> entry : input_schema.getProperties().entrySet()) {
                    String key = entry.getKey();
                    b(key, entry.getValue(), input_schema.getRequired().contains(key), 0, e18Var, 0, 8);
                }
                e18Var.p(false);
            }
            e18Var.p(true);
        } else {
            e18Var.T();
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new jsg(customTool, i, 7);
        }
    }

    public static final void d(String str, Tool.CustomTool customTool, zy7 zy7Var, iqb iqbVar, String str2, ld4 ld4Var, int i, int i2) {
        String str3;
        int i3;
        e18 e18Var;
        iqb iqbVar2;
        String str4;
        str.getClass();
        zy7Var.getClass();
        e18 e18Var2 = (e18) ld4Var;
        e18Var2.c0(-731379296);
        int i4 = i | (e18Var2.f(str) ? 4 : 2) | (e18Var2.f(customTool) ? 32 : 16);
        int i5 = i4 | 3072;
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i4 | 27648;
            str3 = str2;
        } else {
            str3 = str2;
            i3 = i5 | (e18Var2.f(str3) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN);
        }
        byte b = 0;
        if (e18Var2.Q(i3 & 1, (i3 & 9363) != 9362)) {
            if (i6 != 0) {
                str3 = null;
            }
            c36 c36Var = new c36(231, false, false, true);
            fqb fqbVar = fqb.E;
            e18Var = e18Var2;
            trk.b(zy7Var, fd9.q0(-1776779901, new sxa(zy7Var, 29, b), e18Var2), b.c(fqbVar, 0.95f), null, fd9.q0(-1596659321, new ngf(str, 13), e18Var2), fd9.q0(595854472, new nwh(customTool, b, str3), e18Var2), null, 0L, 0L, 0L, 0L, c36Var, e18Var, 1769526, 3072, 8088);
            str4 = str3;
            iqbVar2 = fqbVar;
        } else {
            e18Var = e18Var2;
            e18Var.T();
            iqbVar2 = iqbVar;
            str4 = str3;
        }
        r7e r7eVarS = e18Var.s();
        if (r7eVarS != null) {
            r7eVarS.d = new t9h(str, customTool, zy7Var, iqbVar2, str4, i, i2);
        }
    }
}
