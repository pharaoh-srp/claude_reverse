package defpackage;

import com.anthropic.claude.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class f56 {
    public static final /* synthetic */ f56[] G;
    public static final /* synthetic */ gq6 H;
    public final String E;
    public final int F;

    static {
        f56[] f56VarArr = {new f56(0, R.string.connector_directory_category_code, "Code", "code"), new f56(1, R.string.connector_directory_category_communication, "Communication", "communication"), new f56(2, R.string.connector_directory_category_data, "Data", "data"), new f56(3, R.string.connector_directory_category_design, "Design", "design"), new f56(4, R.string.connector_directory_category_development, "Development", "development"), new f56(5, R.string.connector_directory_category_financial_services, "FinancialServices", "financial-services"), new f56(6, R.string.connector_directory_category_health, "Health", "health"), new f56(7, R.string.connector_directory_category_life_sciences, "LifeSciences", "life-sciences"), new f56(8, R.string.connector_directory_category_productivity, "Productivity", "productivity"), new f56(9, R.string.connector_directory_category_sales_and_marketing, "SalesAndMarketing", "sales-and-marketing")};
        G = f56VarArr;
        H = new gq6(f56VarArr);
    }

    public f56(int i, int i2, String str, String str2) {
        this.E = str2;
        this.F = i2;
    }

    public static f56 valueOf(String str) {
        return (f56) Enum.valueOf(f56.class, str);
    }

    public static f56[] values() {
        return (f56[]) G.clone();
    }
}
