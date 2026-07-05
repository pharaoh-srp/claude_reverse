package defpackage;

import com.anthropic.claude.R;

/* JADX INFO: loaded from: classes3.dex */
public enum g5g {
    Bare(R.string.short_relative_time_bare_minutes, R.string.short_relative_time_bare_hours, R.string.short_relative_time_bare_days),
    Ago(R.string.short_relative_time_ago_minutes, R.string.short_relative_time_ago_hours, R.string.short_relative_time_ago_days);

    public final int E;
    public final int F;
    public final int G;

    g5g(int i, int i2, int i3) {
        this.E = i;
        this.F = i2;
        this.G = i3;
    }
}
