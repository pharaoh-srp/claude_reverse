package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.app.main.loggedin.LoggedInScreens;
import com.anthropic.claude.app.main.loggedout.LoggedOutAppDestination;
import com.anthropic.claude.login.LoginScreens;
import com.anthropic.claude.login.OverlayScreens;
import com.anthropic.claude.mainactivity.MainActivity;
import siftscience.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q59 implements zy7 {
    public final /* synthetic */ int E;

    public /* synthetic */ q59(int i) {
        this.E = i;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                umg umgVar = r59.a;
                return null;
            case 1:
                mo8 mo8Var = z79.a;
                return Boolean.TRUE;
            case 2:
                return new va6(48.0f);
            case 3:
            case 4:
                return ieiVar;
            case 5:
                return yh9.b;
            case 6:
                return ph9.b;
            case 7:
                return kh9.b;
            case 8:
                return uh9.b;
            case 9:
                return lg9.b;
            case 10:
                return otj.i();
            case 11:
                return (m7f) otj.i().c.I;
            case 12:
                xe4 xe4Var = uca.a;
                return null;
            case 13:
                xe4 xe4Var2 = vca.a;
                return null;
            case 14:
                xe4 xe4Var3 = pda.a;
                return null;
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                xe4 xe4Var4 = uda.a;
                return null;
            case g.MAX_FIELD_NUMBER /* 17 */:
                umg umgVar2 = wda.a;
                return a5.I;
            case g.AVG_FIELD_NUMBER /* 18 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case g.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                return LoggedInScreens.AccountVerification._init_$_anonymous_();
            case g.END_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 20 */:
                return LoggedInScreens.ClaudeApp._init_$_anonymous_();
            case 21:
                return LoggedInScreens.Onboarding._init_$_anonymous_();
            case g.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                return LoggedOutAppDestination.LoginApp._init_$_anonymous_();
            case g.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                return x44.W(LoggedOutAppDestination.LoginApp.INSTANCE);
            case 24:
                return mpk.P(Boolean.FALSE);
            case BuildConfig.VERSION_CODE /* 25 */:
                return x44.W(OverlayScreens.None.INSTANCE);
            case 26:
                return LoginScreens._init_$_anonymous_();
            case 27:
                return LoginScreens.Welcome._childSerializers$_anonymous_();
            case 28:
                return auj.d();
            default:
                int i2 = MainActivity.h0;
                return new f20(2);
        }
    }
}
