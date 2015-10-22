package org.openmrs.module.pihmalawi.metadata.deploy.bundle;

import org.openmrs.module.metadatadeploy.bundle.CoreConstructors;
import org.openmrs.module.pihmalawi.metadata.LocationTags;
import org.openmrs.module.pihmalawi.metadata.descriptor.LocationTagDescriptor;
import org.springframework.stereotype.Component;

@Component
public class LocationTagBundle extends PihMetadataBundle {

    @Override
    public void install() throws Exception {
        install(LocationTags.LOGIN_LOCATION);
        install(LocationTags.VISIT_LOCATION);
        install(LocationTags.ADMISSION_LOCATION);
        install(LocationTags.TRANSFER_LOCAITON);
        install(LocationTags.DISPENSING_LOCATION);
    }

    protected void install(LocationTagDescriptor d) {
        install(CoreConstructors.locationTag(d.name(), d.description(), d.uuid()));
    }

}