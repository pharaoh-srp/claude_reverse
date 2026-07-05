package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.McpToolKey;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class koi {
    public final ooi a;
    public final q7 b;
    public final fs5 c;
    public final String d;
    public final String e;
    public final wz5 f;
    public final wz5 g;
    public final wz5 h;
    public final wz5 i;
    public final wz5 j;
    public final wz5 k;
    public final wz5 l;
    public final wz5 m;
    public final wz5 n;
    public final wz5 o;
    public final wz5 p;
    public final kdg q;
    public final lsc r;
    public final wz5 s;
    public final wz5 t;
    public final wz5 u;
    public final wz5 v;

    public koi(ooi ooiVar, q7 q7Var, fs5 fs5Var) {
        this.a = ooiVar;
        this.b = q7Var;
        this.c = fs5Var;
        this.d = ooiVar.a;
        this.e = ooiVar.b;
        a5 a5Var = a5.N;
        final int i = 0;
        this.f = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i2 = i;
                boolean z = true;
                koi koiVar = this.F;
                switch (i2) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i2 = 9;
        this.g = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i2;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i3 = 10;
        this.h = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i3;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i4 = 11;
        this.i = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i4;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i5 = 12;
        this.j = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i5;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i6 = 13;
        this.k = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i6;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i7 = 1;
        this.l = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i7;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i8 = 2;
        this.m = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i8;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i9 = 5;
        this.n = mpk.x(new im(i9, this), a5Var);
        final int i10 = 3;
        this.o = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i10;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i11 = 4;
        this.p = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i11;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        this.q = new kdg();
        this.r = mpk.P(Boolean.FALSE);
        this.s = mpk.w(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i9;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        });
        final int i12 = 6;
        this.t = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i12;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
        final int i13 = 7;
        this.u = mpk.w(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i13;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        });
        final int i14 = 8;
        this.v = mpk.x(new zy7(this) { // from class: joi
            public final /* synthetic */ koi F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Map<McpToolKey, Boolean> enabled_mcp_tools;
                int i22 = i14;
                boolean z = true;
                koi koiVar = this.F;
                switch (i22) {
                    case 0:
                        for (Membership membership : koiVar.b.a().getMemberships()) {
                            if (OrganizationId.m1068equalsimpl0(membership.getOrganization().m116getUuidXjkXN6I(), koiVar.e)) {
                                return membership;
                            }
                        }
                        pmf.h("Collection contains no element matching the predicate.");
                        return null;
                    case 1:
                        AccountSettings settings = koiVar.b.a().getSettings();
                        if (settings != null) {
                            return settings.getEnabled_saffron();
                        }
                        return null;
                    case 2:
                        AccountSettings settings2 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings2 != null ? x44.r(settings2.getEnabled_saffron_search(), Boolean.TRUE) : false);
                    case 3:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getEnabled_model_auto_fallback(), Boolean.FALSE) : false));
                    case 4:
                        AccountSettings settings3 = koiVar.b.a().getSettings();
                        if (settings3 != null) {
                            return settings3.getEnabled_connector_suggestions();
                        }
                        return null;
                    case 5:
                        kdg kdgVar = koiVar.q;
                        int iD0 = tta.d0(x44.y(kdgVar, 10));
                        if (iD0 < 16) {
                            iD0 = 16;
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap(iD0);
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return linkedHashMap;
                            }
                            Object next = c8aVar.next();
                            linkedHashMap.put(McpServerId.m1029boximpl(((McpServer) next).m346getUuidowoRr7k()), next);
                        }
                        break;
                    case 6:
                        kdg kdgVar2 = koiVar.q;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar2.next();
                            if (!qok.m((McpServer) next2)) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 7:
                        if (koiVar.f().isEmpty() && !koiVar.j()) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 8:
                        AccountSettings settings4 = koiVar.b.a().getSettings();
                        return (settings4 == null || (enabled_mcp_tools = settings4.getEnabled_mcp_tools()) == null) ? nm6.E : enabled_mcp_tools;
                    case 9:
                        return koiVar.d().getOrganization();
                    case 10:
                        q7 q7Var2 = koiVar.b;
                        AccountSettings settings5 = q7Var2.a().getSettings();
                        if ((settings5 != null ? x44.r(settings5.getHas_finished_claudeai_onboarding(), Boolean.TRUE) : false) || (q7Var2.a().getFull_name() != null && q7Var2.a().getDisplay_name() != null)) {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    case 11:
                        return Boolean.valueOf(!(koiVar.b.a().getSettings() != null ? x44.r(r5.getPreview_feature_uses_artifacts(), Boolean.FALSE) : false));
                    case 12:
                        AccountSettings settings6 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings6 != null ? x44.r(settings6.getEnabled_turmeric(), Boolean.TRUE) : false);
                    default:
                        AccountSettings settings7 = koiVar.b.a().getSettings();
                        return Boolean.valueOf(settings7 != null ? x44.r(settings7.getEnabled_web_search(), Boolean.TRUE) : false);
                }
            }
        }, a5Var);
    }

    public final boolean a() {
        return !i() || qoi.b.contains(d().getRole());
    }

    public final Map b() {
        return (Map) this.s.getValue();
    }

    public final Map c() {
        return (Map) this.v.getValue();
    }

    public final Membership d() {
        return (Membership) this.f.getValue();
    }

    public final Organization e() {
        return (Organization) this.g.getValue();
    }

    public final List f() {
        return (List) this.t.getValue();
    }

    public final boolean g() {
        return ((Boolean) this.i.getValue()).booleanValue();
    }

    public final boolean h() {
        return eve.C(e()) == pvg.FREE;
    }

    public final boolean i() {
        return eve.C(e()) == pvg.RAVEN;
    }

    public final boolean j() {
        return ((Boolean) this.r.getValue()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) this.o.getValue()).booleanValue();
    }

    public final McpServer l(String str) {
        str.getClass();
        return (McpServer) b().get(McpServerId.m1029boximpl(str));
    }

    public final void m(uja ujaVar) {
        ujaVar.getClass();
        this.c.a.remove(ujaVar);
    }

    public final void n(boolean z) {
        this.r.setValue(Boolean.valueOf(z));
    }
}
