package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import com.anthropic.claude.analytics.events.MobileAppFeedbackEvents$FeedbackType;

/* JADX INFO: loaded from: classes2.dex */
public final class wg7 extends iwe {
    public final qi3 b;
    public final ui0 c;
    public final koi d;
    public final b4e e;
    public final ContentResolver f;
    public final lsc g;
    public final lsc h;
    public final lsc i;
    public final lsc j;
    public final kdg k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg7(qi3 qi3Var, h86 h86Var, ui0 ui0Var, koi koiVar, b4e b4eVar, Context context, MobileAppFeedbackEvents$FeedbackType mobileAppFeedbackEvents$FeedbackType) {
        super(h86Var);
        context.getClass();
        mobileAppFeedbackEvents$FeedbackType.getClass();
        this.b = qi3Var;
        this.c = ui0Var;
        this.d = koiVar;
        this.e = b4eVar;
        this.f = context.getContentResolver();
        this.g = mpk.P(mobileAppFeedbackEvents$FeedbackType);
        this.h = mpk.P(new cjh((String) null, 0L, 7));
        Boolean bool = Boolean.FALSE;
        this.i = mpk.P(bool);
        this.j = mpk.P(bool);
        this.k = new kdg();
    }
}
