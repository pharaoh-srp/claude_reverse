package defpackage;

import com.anthropic.claude.analytics.events.OnboardingEvents$PhoneVerificationCountryCodeDialogFinished;
import com.anthropic.claude.analytics.events.OnboardingEvents$PhoneVerificationCountryCodeDialogStarted;
import com.anthropic.claude.analytics.events.UpdateEvents$FlexibleUpdateFailed;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class au2 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ qi3 F;

    public /* synthetic */ au2(qi3 qi3Var, int i) {
        this.E = i;
        this.F = qi3Var;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        qi3 qi3Var = this.F;
        switch (i) {
            case 0:
                Exception exc = (Exception) obj;
                exc.getClass();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                qi3Var.e(new UpdateEvents$FlexibleUpdateFailed(message), UpdateEvents$FlexibleUpdateFailed.Companion.serializer());
                break;
            case 1:
                qi3Var.e(new OnboardingEvents$PhoneVerificationCountryCodeDialogStarted(((Integer) obj).intValue()), OnboardingEvents$PhoneVerificationCountryCodeDialogStarted.Companion.serializer());
                break;
            case 2:
                qi3Var.e(new OnboardingEvents$PhoneVerificationCountryCodeDialogFinished(((Integer) obj).intValue()), OnboardingEvents$PhoneVerificationCountryCodeDialogFinished.Companion.serializer());
                break;
            case 3:
                qi3Var.e(new OnboardingEvents$PhoneVerificationCountryCodeDialogStarted(((Integer) obj).intValue()), OnboardingEvents$PhoneVerificationCountryCodeDialogStarted.Companion.serializer());
                break;
            default:
                qi3Var.e(new OnboardingEvents$PhoneVerificationCountryCodeDialogFinished(((Integer) obj).intValue()), OnboardingEvents$PhoneVerificationCountryCodeDialogFinished.Companion.serializer());
                break;
        }
        return ieiVar;
    }
}
