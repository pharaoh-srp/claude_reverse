package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import defpackage.m08;
import defpackage.mdj;
import defpackage.pz7;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = mdj.f)
public final /* synthetic */ class GetCredentialController$resultReceiver$1$onReceiveResult$1 extends m08 implements pz7 {
    public GetCredentialController$resultReceiver$1$onReceiveResult$1(Object obj) {
        super(2, 0, CredentialProviderBaseController.Companion.class, obj, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;");
    }

    @Override // defpackage.pz7
    public final GetCredentialException invoke(String str, String str2) {
        return ((CredentialProviderBaseController.Companion) this.receiver).getCredentialExceptionTypeToException$credentials_play_services_auth(str, str2);
    }
}
