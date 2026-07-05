package defpackage;

import com.anthropic.claude.protos.push.ConwayWakeRequest;
import com.anthropic.claude.protos.push.LoggedInPushOperationsService;
import com.anthropic.claude.protos.push.OpenChatRequest;
import com.anthropic.claude.protos.push.OpenCodeSessionRequest;
import com.anthropic.claude.protos.push.OpenCoworkSessionRequest;
import com.anthropic.claude.protos.push.OpenDispatchRequest;
import com.anthropic.claude.protos.push.OpenOrbitRequest;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.OrganizationId;
import com.anthropic.claude.types.strings.SessionId;

/* JADX INFO: loaded from: classes.dex */
public final class mga implements LoggedInPushOperationsService {
    public final bhc a;
    public final dhc b;
    public final jhc c;
    public final ghc d;

    public mga(bhc bhcVar, dhc dhcVar, jhc jhcVar, ghc ghcVar) {
        this.a = bhcVar;
        this.b = dhcVar;
        this.c = jhcVar;
        this.d = ghcVar;
    }

    @Override // com.anthropic.claude.protos.push.LoggedInPushOperationsService
    public final Object conwayWake(ConwayWakeRequest conwayWakeRequest, tp4 tp4Var) {
        this.d.a(new fhc(AccountId.m944constructorimpl(conwayWakeRequest.getAccount_uuid()), OrganizationId.m1066constructorimpl(conwayWakeRequest.getOrganization_uuid())));
        return iei.a;
    }

    @Override // com.anthropic.claude.protos.push.LoggedInPushOperationsService
    public final Object openChat(OpenChatRequest openChatRequest, tp4 tp4Var) {
        this.a.a.setValue(new ahc(ChatId.m979constructorimpl(openChatRequest.getConversation_uuid()), AccountId.m944constructorimpl(openChatRequest.getAccount_uuid()), OrganizationId.m1066constructorimpl(openChatRequest.getOrganization_uuid()), 56, null, null, null));
        return iei.a;
    }

    @Override // com.anthropic.claude.protos.push.LoggedInPushOperationsService
    public final Object openCodeSession(OpenCodeSessionRequest openCodeSessionRequest, tp4 tp4Var) {
        this.b.a(new chc(SessionId.m1115constructorimpl(openCodeSessionRequest.getSession_id()), AccountId.m944constructorimpl(openCodeSessionRequest.getAccount_uuid()), OrganizationId.m1066constructorimpl(openCodeSessionRequest.getOrganization_uuid()), false));
        return iei.a;
    }

    @Override // com.anthropic.claude.protos.push.LoggedInPushOperationsService
    public final Object openCoworkSession(OpenCoworkSessionRequest openCoworkSessionRequest, tp4 tp4Var) {
        this.b.a(new chc(SessionId.m1115constructorimpl(openCoworkSessionRequest.getSession_id()), AccountId.m944constructorimpl(openCoworkSessionRequest.getAccount_uuid()), OrganizationId.m1066constructorimpl(openCoworkSessionRequest.getOrganization_uuid()), true));
        return iei.a;
    }

    @Override // com.anthropic.claude.protos.push.LoggedInPushOperationsService
    public final Object openDispatch(OpenDispatchRequest openDispatchRequest, tp4 tp4Var) {
        this.c.a.setValue(new ihc(SessionId.m1115constructorimpl(openDispatchRequest.getSession_id()), AccountId.m944constructorimpl(openDispatchRequest.getAccount_uuid()), OrganizationId.m1066constructorimpl(openDispatchRequest.getOrganization_uuid())));
        return iei.a;
    }

    @Override // com.anthropic.claude.protos.push.LoggedInPushOperationsService
    public final Object openOrbit(OpenOrbitRequest openOrbitRequest, tp4 tp4Var) {
        return iei.a;
    }
}
