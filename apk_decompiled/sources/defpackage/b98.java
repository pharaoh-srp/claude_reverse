package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b98 {
    public final rc8 a;
    public final kw9 b;
    public final kw9 c;
    public final kw9 d;
    public final kw9 e;

    public b98(rc8 rc8Var) {
        this.a = rc8Var;
        final int i = 0;
        zy7 zy7Var = new zy7(this) { // from class: a98
            public final /* synthetic */ b98 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                b98 b98Var = this.F;
                switch (i2) {
                    case 0:
                        return mp0.Z0(new String[]{(String) b98Var.c.getValue(), (String) b98Var.d.getValue()});
                    case 1:
                        String str = (String) b98Var.a.g("mobile_android_billing_product_id_override", srg.a).getValue();
                        return str == null ? "com.anthropic.claude.pro" : str;
                    case 2:
                        String str2 = (String) b98Var.a.g("mobile_android_billing_max_product_id_override", srg.a).getValue();
                        return str2 == null ? "com.anthropic.claude.max" : str2;
                    default:
                        List list = (List) b98Var.a.g("mobile_android_billing_supported_base_plans_pro_override", new uo0(srg.a, 0)).getValue();
                        return list != null ? w44.t1(list) : c98.a;
                }
            }
        };
        w1a w1aVar = w1a.G;
        this.b = yb5.w(w1aVar, zy7Var);
        final int i2 = 1;
        this.c = yb5.w(w1aVar, new zy7(this) { // from class: a98
            public final /* synthetic */ b98 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                b98 b98Var = this.F;
                switch (i22) {
                    case 0:
                        return mp0.Z0(new String[]{(String) b98Var.c.getValue(), (String) b98Var.d.getValue()});
                    case 1:
                        String str = (String) b98Var.a.g("mobile_android_billing_product_id_override", srg.a).getValue();
                        return str == null ? "com.anthropic.claude.pro" : str;
                    case 2:
                        String str2 = (String) b98Var.a.g("mobile_android_billing_max_product_id_override", srg.a).getValue();
                        return str2 == null ? "com.anthropic.claude.max" : str2;
                    default:
                        List list = (List) b98Var.a.g("mobile_android_billing_supported_base_plans_pro_override", new uo0(srg.a, 0)).getValue();
                        return list != null ? w44.t1(list) : c98.a;
                }
            }
        });
        final int i3 = 2;
        this.d = yb5.w(w1aVar, new zy7(this) { // from class: a98
            public final /* synthetic */ b98 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                b98 b98Var = this.F;
                switch (i22) {
                    case 0:
                        return mp0.Z0(new String[]{(String) b98Var.c.getValue(), (String) b98Var.d.getValue()});
                    case 1:
                        String str = (String) b98Var.a.g("mobile_android_billing_product_id_override", srg.a).getValue();
                        return str == null ? "com.anthropic.claude.pro" : str;
                    case 2:
                        String str2 = (String) b98Var.a.g("mobile_android_billing_max_product_id_override", srg.a).getValue();
                        return str2 == null ? "com.anthropic.claude.max" : str2;
                    default:
                        List list = (List) b98Var.a.g("mobile_android_billing_supported_base_plans_pro_override", new uo0(srg.a, 0)).getValue();
                        return list != null ? w44.t1(list) : c98.a;
                }
            }
        });
        final int i4 = 3;
        this.e = yb5.w(w1aVar, new zy7(this) { // from class: a98
            public final /* synthetic */ b98 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i4;
                b98 b98Var = this.F;
                switch (i22) {
                    case 0:
                        return mp0.Z0(new String[]{(String) b98Var.c.getValue(), (String) b98Var.d.getValue()});
                    case 1:
                        String str = (String) b98Var.a.g("mobile_android_billing_product_id_override", srg.a).getValue();
                        return str == null ? "com.anthropic.claude.pro" : str;
                    case 2:
                        String str2 = (String) b98Var.a.g("mobile_android_billing_max_product_id_override", srg.a).getValue();
                        return str2 == null ? "com.anthropic.claude.max" : str2;
                    default:
                        List list = (List) b98Var.a.g("mobile_android_billing_supported_base_plans_pro_override", new uo0(srg.a, 0)).getValue();
                        return list != null ? w44.t1(list) : c98.a;
                }
            }
        });
    }
}
