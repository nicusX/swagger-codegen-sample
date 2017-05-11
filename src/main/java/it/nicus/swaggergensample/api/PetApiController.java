package it.nicus.swaggergensample.api;

import it.nicus.swaggergensample.model.ModelApiResponse;
import it.nicus.swaggergensample.model.Pet;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class PetApiController implements PetApi {


    @Override
    public ResponseEntity<Void> addPet(Pet body, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deletePet(Long petId, String apiKey, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByStatus(List<String> status, String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<List<Pet>> findPetsByTags(List<String> tags, String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<Pet> getPetById(Long petId, String accept) throws IOException {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePet(Pet body, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updatePetWithForm(Long petId, String name, String status, String accept) {
        return null;
    }

    @Override
    public ResponseEntity<ModelApiResponse> uploadFile(Long petId, String additionalMetadata, MultipartFile file, String accept) throws IOException {
        return null;
    }
}
