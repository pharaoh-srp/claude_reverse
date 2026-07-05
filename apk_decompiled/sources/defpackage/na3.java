package defpackage;

import com.anthropic.claude.api.notification.ChannelPreference;
import com.anthropic.claude.api.notification.FeaturePreference;
import com.anthropic.claude.api.notification.Preferences;

/* JADX INFO: loaded from: classes.dex */
public final class na3 {
    public final qi3 a;
    public final koi b;
    public final oa3 c;
    public final i8c d;
    public final lsc e = mpk.P(Boolean.FALSE);
    public final wz5 f;
    public final wz5 g;

    public na3(qi3 qi3Var, koi koiVar, oa3 oa3Var, i8c i8cVar) {
        this.a = qi3Var;
        this.b = koiVar;
        this.c = oa3Var;
        this.d = i8cVar;
        final int i = 0;
        this.f = mpk.w(new zy7(this) { // from class: ma3
            public final /* synthetic */ na3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                FeaturePreference feature_preference;
                int i2 = i;
                na3 na3Var = this.F;
                switch (i2) {
                    case 0:
                        bz7 bz7Var = g9c.G.E;
                        Preferences notification_preferences = na3Var.b.d().getNotification_preferences();
                        if (notification_preferences == null || (feature_preference = notification_preferences.getFeature_preference()) == null) {
                            return null;
                        }
                        return (ChannelPreference) bz7Var.invoke(feature_preference);
                    default:
                        boolean z = false;
                        if (((Boolean) na3Var.d.a.getValue()).booleanValue()) {
                            ChannelPreference channelPreference = (ChannelPreference) na3Var.f.getValue();
                            if (!(channelPreference != null ? x44.r(channelPreference.getEnable_push(), Boolean.TRUE) : false) && !((Boolean) na3Var.e.getValue()).booleanValue() && na3Var.c.b.h() < 2) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.g = mpk.w(new zy7(this) { // from class: ma3
            public final /* synthetic */ na3 F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                FeaturePreference feature_preference;
                int i22 = i2;
                na3 na3Var = this.F;
                switch (i22) {
                    case 0:
                        bz7 bz7Var = g9c.G.E;
                        Preferences notification_preferences = na3Var.b.d().getNotification_preferences();
                        if (notification_preferences == null || (feature_preference = notification_preferences.getFeature_preference()) == null) {
                            return null;
                        }
                        return (ChannelPreference) bz7Var.invoke(feature_preference);
                    default:
                        boolean z = false;
                        if (((Boolean) na3Var.d.a.getValue()).booleanValue()) {
                            ChannelPreference channelPreference = (ChannelPreference) na3Var.f.getValue();
                            if (!(channelPreference != null ? x44.r(channelPreference.getEnable_push(), Boolean.TRUE) : false) && !((Boolean) na3Var.e.getValue()).booleanValue() && na3Var.c.b.h() < 2) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }
}
