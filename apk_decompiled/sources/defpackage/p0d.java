package defpackage;

import com.anthropic.claude.R;
import com.anthropic.claude.api.chat.tool.ToolResultText;
import com.anthropic.claude.tool.custom.PhoneUseOutput;
import com.anthropic.claude.tool.model.PhoneCallCompletedInput;
import com.anthropic.claude.tool.model.PhoneCallCompletedOutput;
import com.anthropic.claude.tool.model.PhoneUseInput;
import com.anthropic.claude.tool.ui.chat.e;
import com.pvporbit.freetype.FreeTypeConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0d extends dxh {
    public final /* synthetic */ int e;
    public final String f;
    public final k1d g;
    public final String h;
    public final dwh i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0d(String str, mwh mwhVar, k1d k1dVar, int i) {
        super(mwhVar, PhoneCallCompletedInput.Companion.serializer(), PhoneCallCompletedOutput.Companion.serializer());
        this.e = i;
        switch (i) {
            case 1:
                super(mwhVar, PhoneUseInput.Companion.serializer(), PhoneUseOutput.Companion.serializer());
                this.f = str;
                this.g = k1dVar;
                this.h = hxh.z;
                this.i = new dwh();
                break;
            default:
                this.f = str;
                this.g = k1dVar;
                this.h = hxh.A;
                this.i = new dwh();
                break;
        }
    }

    @Override // defpackage.dxh
    public final void c(final String str, final String str2, final boolean z, final dlb dlbVar, final lvh lvhVar, final boolean z2, final boolean z3, final iqb iqbVar, ld4 ld4Var, final int i) {
        int i2;
        r7e r7eVarS;
        pz7 pz7Var;
        String phone_use_tool_id;
        Object znVar;
        String str3;
        boolean z4;
        int i3 = this.e;
        int i4 = FreeTypeConstants.FT_LOAD_NO_RECURSE;
        switch (i3) {
            case 0:
                ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
                e18 e18Var = (e18) ld4Var;
                e18Var.c0(-775168244);
                if ((i & 3072) == 0) {
                    if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var.f(dlbVar) : e18Var.h(dlbVar)) {
                        i4 = 2048;
                    }
                    i2 = i | i4;
                } else {
                    i2 = i;
                }
                if ((i & 196608) == 0) {
                    i2 |= e18Var.g(z2) ? 131072 : 65536;
                }
                if ((i & 100663296) == 0) {
                    i2 |= (i & 134217728) == 0 ? e18Var.f(this) : e18Var.h(this) ? 67108864 : 33554432;
                }
                if (e18Var.Q(i2 & 1, (33620993 & i2) != 33620992)) {
                    PhoneCallCompletedInput phoneCallCompletedInput = (PhoneCallCompletedInput) dlbVar.a();
                    if (phoneCallCompletedInput == null || (phone_use_tool_id = phoneCallCompletedInput.getPhone_use_tool_id()) == null) {
                        r7eVarS = e18Var.s();
                        if (r7eVarS != null) {
                            final int i5 = 0;
                            pz7Var = new pz7(this) { // from class: o0d
                                public final /* synthetic */ p0d F;

                                {
                                    this.F = this;
                                }

                                @Override // defpackage.pz7
                                public final Object invoke(Object obj, Object obj2) {
                                    int i6 = i5;
                                    iei ieiVar = iei.a;
                                    int i7 = i;
                                    switch (i6) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP0 = x44.p0(i7 | 1);
                                            this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP0);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iP02 = x44.p0(i7 | 1);
                                            this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP02);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP03 = x44.p0(i7 | 1);
                                            this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP03);
                                            break;
                                    }
                                    return ieiVar;
                                }
                            };
                            r7eVarS.d = pz7Var;
                        }
                    } else if (!z2) {
                        r7e r7eVarS2 = e18Var.s();
                        if (r7eVarS2 != null) {
                            final int i6 = 1;
                            r7eVarS2.d = new pz7(this) { // from class: o0d
                                public final /* synthetic */ p0d F;

                                {
                                    this.F = this;
                                }

                                @Override // defpackage.pz7
                                public final Object invoke(Object obj, Object obj2) {
                                    int i62 = i6;
                                    iei ieiVar = iei.a;
                                    int i7 = i;
                                    switch (i62) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP0 = x44.p0(i7 | 1);
                                            this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP0);
                                            break;
                                        case 1:
                                            ((Integer) obj2).getClass();
                                            int iP02 = x44.p0(i7 | 1);
                                            this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP02);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP03 = x44.p0(i7 | 1);
                                            this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP03);
                                            break;
                                    }
                                    return ieiVar;
                                }
                            };
                        }
                    } else {
                        PhoneCallCompletedOutput phoneCallCompletedOutput = (PhoneCallCompletedOutput) dlbVar.b();
                        boolean zF = ((234881024 & i2) == 67108864 || ((i2 & 134217728) != 0 && e18Var.h(this))) | e18Var.f(phone_use_tool_id) | e18Var.f(phoneCallCompletedOutput);
                        Object objN = e18Var.N();
                        if (zF || objN == jd4.a) {
                            str3 = phone_use_tool_id;
                            znVar = new zn(this, str3, phoneCallCompletedOutput, null, 24);
                            e18Var.k0(znVar);
                        } else {
                            znVar = objN;
                            str3 = phone_use_tool_id;
                        }
                        fd9.j(str3, phoneCallCompletedOutput, (pz7) znVar, e18Var);
                    }
                } else {
                    e18Var.T();
                }
                r7eVarS = e18Var.s();
                if (r7eVarS != null) {
                    final int i7 = 2;
                    pz7Var = new pz7(this) { // from class: o0d
                        public final /* synthetic */ p0d F;

                        {
                            this.F = this;
                        }

                        @Override // defpackage.pz7
                        public final Object invoke(Object obj, Object obj2) {
                            int i62 = i7;
                            iei ieiVar = iei.a;
                            int i72 = i;
                            switch (i62) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP0 = x44.p0(i72 | 1);
                                    this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP0);
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    int iP02 = x44.p0(i72 | 1);
                                    this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP02);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP03 = x44.p0(i72 | 1);
                                    this.F.c(str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, (ld4) obj, iP03);
                                    break;
                            }
                            return ieiVar;
                        }
                    };
                    r7eVarS.d = pz7Var;
                }
                break;
            default:
                ebh.B(str, str2, dlbVar, lvhVar, iqbVar);
                e18 e18Var2 = (e18) ld4Var;
                e18Var2.c0(-1568601204);
                int i8 = (i & 6) == 0 ? (e18Var2.f(str) ? 4 : 2) | i : i;
                if ((i & 3072) == 0) {
                    if ((i & FreeTypeConstants.FT_LOAD_MONOCHROME) == 0 ? e18Var2.f(dlbVar) : e18Var2.h(dlbVar)) {
                        i4 = 2048;
                    }
                    i8 |= i4;
                }
                if ((i & 24576) == 0) {
                    i8 |= (32768 & i) == 0 ? e18Var2.f(lvhVar) : e18Var2.h(lvhVar) ? 16384 : FreeTypeConstants.FT_LOAD_LINEAR_DESIGN;
                }
                if ((i & 196608) == 0) {
                    i8 |= e18Var2.g(z2) ? 131072 : 65536;
                }
                if ((1572864 & i) == 0) {
                    z4 = z3;
                    i8 |= e18Var2.g(z4) ? FreeTypeConstants.FT_LOAD_COLOR : 524288;
                } else {
                    z4 = z3;
                }
                if ((12582912 & i) == 0) {
                    i8 |= e18Var2.f(iqbVar) ? 8388608 : 4194304;
                }
                if ((100663296 & i) == 0) {
                    i8 |= (i & 134217728) == 0 ? e18Var2.f(this) : e18Var2.h(this) ? 67108864 : 33554432;
                }
                if (e18Var2.Q(i8 & 1, (38347779 & i8) != 38347778)) {
                    int i9 = i8 >> 6;
                    e.c(str, (PhoneUseInput) dlbVar.a(), (PhoneUseOutput) dlbVar.b(), z2, z4, this.g, lvhVar, iqbVar, e18Var2, (i8 & 14) | (i9 & 7168) | (i9 & 57344) | (3670016 & (i8 << 6)) | (i8 & 29360128));
                } else {
                    e18Var2.T();
                }
                r7e r7eVarS3 = e18Var2.s();
                if (r7eVarS3 != null) {
                    r7eVarS3.d = new ss(this, str, str2, z, dlbVar, lvhVar, z2, z3, iqbVar, i, 17);
                }
                break;
        }
    }

    @Override // defpackage.dxh
    public Object h(List list, tp4 tp4Var) {
        String text;
        switch (this.e) {
            case 1:
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof ToolResultText) {
                        arrayList.add(obj);
                    }
                }
                ToolResultText toolResultText = (ToolResultText) w44.N0(arrayList);
                if (toolResultText == null || (text = toolResultText.getText()) == null) {
                    return null;
                }
                return new PhoneUseOutput(text);
            default:
                return super.h(list, tp4Var);
        }
    }

    @Override // defpackage.dxh
    public final fwh n() {
        switch (this.e) {
        }
        return this.i;
    }

    @Override // defpackage.dxh
    public final vwh o() {
        switch (this.e) {
        }
        return new uwh(false);
    }

    @Override // defpackage.dxh
    public final int p() {
        switch (this.e) {
            case 0:
                ud0 ud0Var = ud0.d;
                ud0 ud0Var2 = ud0.d;
                break;
            default:
                ud0 ud0Var3 = ud0.d;
                ud0 ud0Var4 = ud0.d;
                break;
        }
        return R.drawable.anthropicon_phone;
    }

    @Override // defpackage.dxh
    public final String r() {
        switch (this.e) {
        }
        return this.h;
    }

    @Override // defpackage.dxh
    public final String s() {
        switch (this.e) {
        }
        return this.f;
    }
}
