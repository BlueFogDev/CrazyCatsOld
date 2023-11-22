package eu.bluefogdev.CrazyCats.views;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.server.auth.AccessAnnotationChecker;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class MainLayout extends AppLayout {

    public MainLayout(AuthenticatedUser authenticatedUser, AccessAnnotationChecker accessChecker) {
        this.authenticatedUser = authenticatedUser;
        this.accessChecker = accessChecker;

        NavigationHeader navigationHeader = new NavigationHeader(authenticatedUser);
        viewTitle = new H2();
        viewTitle.addClassNames("page-title", LumoUtility.FontSize.LARGE, LumoUtility.Margin.NONE);
        VerticalLayout logoContainer = createLogoContainer();

        Navigation navigation = new Navigation(authenticatedUser, accessChecker);
        NavigationFooter navigationFooter = new NavigationFooter(authenticatedUser);

        setPrimarySection(Section.DRAWER);
        Div versionTagContainer = new Div();
        Text versionTag = new Text("Version " + VERSION);
        versionTagContainer.add(versionTag);

        addToNavbar(true, navigationHeader, viewTitle, versionTagContainer);
        addToDrawer(logoContainer, navigation, new Scroller(), navigationFooter);
    }
}
