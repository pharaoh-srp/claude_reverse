package androidx.credentials.exceptions;

import defpackage.mdj;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/ClearCredentialProviderConfigurationException;", "Landroidx/credentials/exceptions/ClearCredentialException;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = mdj.f)
public final class ClearCredentialProviderConfigurationException extends ClearCredentialException {
    public ClearCredentialProviderConfigurationException() {
        super("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION");
    }
}
